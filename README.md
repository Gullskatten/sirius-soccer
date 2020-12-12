# Sirius Soccer ⚽️

## Background
This project is a solution to the semester group project in the course "TDT4250 - Avansert programvaredesign".

## Case
**Part 1:** Create a parser to transform a publicly available data set into a format which can be used within the [Eclipse Modelling Framework (EMF)](https://www.eclipse.org/modeling/emf/) with Eclipse (XMI). 

**Part 2:** Create an e-core model of the data set using EMF. 

**Part 3:** Create a tool using either Sirius (for creating a graphical view/editor) or XText (DSL) to either view or modify the existing data set.

## Solution
The group chose to use a [Soccer data set from kaggle.com](https://www.kaggle.com/hugomathien/soccer), which consist of soccer matches, teams and players from eight leagues for the seasons 2009-2016. The data was stored in an SQLite-database, which would first be parsed into a CSV-format using capabilities within IntelliJ and then be processed by a custom parser created by the group. In addition to the original structure of the data set, the parser creates multiple new tables and relations between the data - like season standings for teams, and player positions within a match (e.g., "keeper", "defence"). The format of the output from the parser corresponds to the e-core model definition, so the tasks of modeling and parsing were done in parallel. Finally, a graphical tool using Sirius was made, which supports navigation of the data set with details about the teams and matches.


### Part 1: Running the Soccer DB parser code
This step expects that you to have an IDEA installed, preferrably IntelliJ (for the database view). The parser code for part 1 of the assignment can be found [here](https://github.com/Gullskatten/sirius-soccer/blob/main/no.ntnu.soccer.parser/). Running the parser requires you to download the [data set](https://www.kaggle.com/hugomathien/soccer) from kaggle.com, then extract every table into separate CSV files using the filenames as shown in Figure 1, corresponding to the table from Figure 2 (see screenshots below).

![CSV files in Resources folder](https://github.com/Gullskatten/sirius-soccer/blob/main/docs/csv-files-in-resources.png)

**Figure 1:** _Screenhot of csv-files required in order to perform the parsing (from file explorer in IntelliJ)_


![Database View IntelliJ](https://github.com/Gullskatten/sirius-soccer/blob/main/docs/database-view-soccerdb.png)

**Figure 2:** _Screenshot of the database tables defined in the SQLite-database (from Database view in IntelliJ)_

### Parser output (XMI)
The output file of the transformation can be found and opened directly in your browser [here](https://github.com/Gullskatten/sirius-soccer/blob/main/no.ntnu.soccer.parser/sample.soccer). In order to limit the file size of the data set, the group decided to perform parsing selecting only data from the country "England" and a single season "2015/2016". The [PerformParser.java](https://github.com/Gullskatten/sirius-soccer/blob/main/no.ntnu.soccer.parser/src/main/java/PerformParsing.java) may however easily be modified to include all countries and seasons.



### Part 2: E-core Model
An e-core model is in essence a representation of the domain, in this context, the soccer matches domain. It describes the various relations between the entities of the domain, and the constraints of both attributes and relations within an entity. 

![E-core model](https://github.com/Gullskatten/sirius-soccer/blob/main/docs/ecore-model.png)
**Figure 3:** _Screenshot of the e-core model_


### Part 3: Sirius 

- Right click on the 'no.ntnu.soccer.model.editor' project and create a new run configuration with default settings.
![Run Configuration](https://github.com/Gullskatten/sirius-soccer/blob/main/docs/run.png)
**Figure 4:** _Screenshot of run configuration setup_

- Import exicting projects into workspace
![Run Configuration](https://github.com/Gullskatten/sirius-soccer/blob/main/docs/import_projects.png)
**Figure 5:** _Import projects_

- Import these projects into the new workspace: "no.ntnu.soccer.design", "no.ntnu.soccer.sample".
![Run Configuration](https://github.com/Gullskatten/sirius-soccer/blob/main/docs/select_projects.png)
**Figure 6:** _Screenshot of the projects that needs to be imported_

- To edit the representations of diagrams and tables, open the soccer.odesign as shown below.
![Run Configuration](https://github.com/Gullskatten/sirius-soccer/blob/main/docs/odesign.png)
**Figure 7:** _Screenshot of soccer.odesign_

- To view the diagrams and tables we have created, open the representation.aird file and select the view you want to open in the "Representation" tab.
![Run Configuration](https://github.com/Gullskatten/sirius-soccer/blob/main/docs/representation.aird.png)
**Figure 8:** _Screenshot of representation.aird_

### ViewPoints

- MatchDay: This diagram presents one matchday in a season. A matchday is consists of a date and one or several matches. This diagram presents every match on a specified matchday and vizualizes if a team won, lost or if the match ended in a draw. The diagram consists of a MatchDay Node that presents the match date square, and inside each match container we have set several conditinal styles to determine which team won and colour their respectitve container green, red or grey depending on the match result. A relation based edge is created to link the match day to each match.
![Run Configuration](https://github.com/Gullskatten/sirius-soccer/blob/main/docs/MatchDay.jpg)
**Figure 9:** _Screenshot of the match day view_

- Match: The match diragam presents the teams and players who played the match. The presentation consists of a match node that contains the team's short name, and an opponent container that contains off all the positions and their players. The opponent container is styled with an image of an soccer field and its children(positions) are presneted as a vertical stack. The player node is inside the position container and presented in a list form.
![Run Configuration](https://github.com/Gullskatten/sirius-soccer/blob/main/docs/match.jpg)
**Figure 9:** _Screenshot of the match view_


- Team: Team View consists of a Team container which presents the information stored in the Team class, and a Placements container which presents the teams placement information in a given season.
![Run Configuration](https://github.com/Gullskatten/sirius-soccer/blob/main/docs/team.jpg)
**Figure 9:** _Screenshot of the team view_

### Table

![Run Configuration](https://github.com/Gullskatten/sirius-soccer/blob/main/docs/table.png)
**Figure 9:** _Screenshot of the season 2015/2016 table_

### Navigation between views

To be able to navigate between different diagrams we have added a bordered node on the match day view and match view. With the navigation tool this allows us to navigate to a different diagram by double-clicking. If the diagram don't exist a new one will be created.

- From match day to match: Double-click on the information icon labeled with 'Show Match Information'.
- From match to team: Double-Click on the information icon labeled with 'Show team information'


### Validation

Some semantic validation rules has been added on the Match day representation to ensure that each match has two opponents. An error message will be displayed if the program is validated and there exicts a match that doesn't have two opponents.

### Filter

Three filter functions have been added. 

- Draw filter in match day diagram

Filters out every match in a match day where the result was 'DRAW'.

- Keeper and Defence filter on match diagram

Used to filter out positions and the players contained inside that position.

### Creation Tool

- Create a Match and Opponents in the matchday diagram

We use a container creation tool to create a Match container. Since there are several values that needs to be set for a match we create a dialog windows where every feature of a match is displayed to the user so he can fill out necesssary information.

- Create Positions and Players in the match diagram

After a new match is created we can use the createOpponent tool to create one of the match opponents. A dialog window will appear where the user can chooce team and if the team is HOME or AWAY team. The references between match and opponents wil be automaticly set. You will have to repeat the last step twice since each match needs two opponents.
