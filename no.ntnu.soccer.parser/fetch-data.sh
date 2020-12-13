#!/usr/bin/env bash

set -o errexit
set -o pipefail
set -o nounset
# set -o xtrace

usage() {
	cat <<-EndUsage
	usage: $0 [-h] [-d database] [-o dir]

	Fetch a copy of the soccer database and export it to csv-files.

	optional arguments:

	  -h           show this help message and exit
	  -d database  path to the database file to export data from
	  -o dir       directory to export data to
	EndUsage
}

die() {
	echo "$1" 1>&2
	exit 1
}

root=$(git rev-parse --show-toplevel)
parser_root="$root/no.ntnu.soccer.parser"

# The data set used in this project originates from a database downloaded
# from kaggle.com (https://www.kaggle.com/hugomathien/soccer). Because an
# account is required to download it from there, we've made it accessible
# sans kaggle credentials, at another location, for the assessment of the
# project submission.
download_url='https://folk.ntnu.no/einaru/files/soccer-data.zip'
download_as="$parser_root/soccer-data.zip"
unzip_outdir="$parser_root"
db_filename="$unzip_outdir/database.sqlite"
csv_outdir="$parser_root/src/main/resources"

while getopts ":hd:o:" opt;
do
	case "$opt" in
		h)
			usage
			exit 0
			;;
		d)
			db_filename="$OPTARG"
			;;
		o)
			csv_outdir="$OPTARG"
			;;
		\?)
			die "Invalid option: -$OPTARG"
			;;
		:)
			die "Missing argument: -$OPTARG"
			;;
	esac
done

[ ! -d "$csv_outdir" ] && mkdir -p "$csv_outdir"

fetch_db() {
	local url="$1"
	local save_as="$2"
	wget "$url" --output-document="$save_as"
}

export_csv() {
	declare -A tables=(
		['Country']='countries'
		['League']='leagues'
		['Match']='matches'
		['Player']='players'
		#['Player_Attributes']='player_attributes'
		['Team']='teams'
		#['Team_Attributes']='team_attributes'
	)
	local database="$1"
	local output_dir="$2"

	for table in ${!tables[@]};
	do
		output_file="$output_dir/${tables[$table]}.csv"
		echo "Exporting $table -> $output_file"
		sqlite3 "$database" <<-EndSQLite
		.headers off
		.mode csv
		.output $output_file
		select * from $table;
		EndSQLite
	done
}

if [ -f "$db_filename" ]; then
	echo "Database already present: $db_filename"
	echo "Won't download it again"
else
	fetch_db "$download_url" "$download_as"
	unzip "$download_as" -d "$unzip_outdir"
fi
export_csv "$db_filename" "$csv_outdir"
