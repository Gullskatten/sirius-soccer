/**
 */
package soccer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see soccer.SoccerFactory
 * @model kind="package"
 * @generated
 */
public interface SoccerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "soccer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.ntnu.soccer.model/model/soccer.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "no.ntnu";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoccerPackage eINSTANCE = soccer.impl.SoccerPackageImpl.init();

	/**
	 * The meta object id for the '{@link soccer.impl.SportImpl <em>Sport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soccer.impl.SportImpl
	 * @see soccer.impl.SoccerPackageImpl#getSport()
	 * @generated
	 */
	int SPORT = 0;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT__COUNTRIES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Sport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link soccer.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soccer.impl.CountryImpl
	 * @see soccer.impl.SoccerPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = 1;

	/**
	 * The feature id for the '<em><b>League</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__LEAGUE = 2;

	/**
	 * The feature id for the '<em><b>Sport</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__SPORT = 3;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link soccer.impl.LeagueImpl <em>League</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soccer.impl.LeagueImpl
	 * @see soccer.impl.SoccerPackageImpl#getLeague()
	 * @generated
	 */
	int LEAGUE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Seasons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__SEASONS = 3;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__TEAMS = 4;

	/**
	 * The number of structural features of the '<em>League</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>League</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link soccer.impl.SeasonImpl <em>Season</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soccer.impl.SeasonImpl
	 * @see soccer.impl.SoccerPackageImpl#getSeason()
	 * @generated
	 */
	int SEASON = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__NAME = 0;

	/**
	 * The feature id for the '<em><b>League</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__LEAGUE = 1;

	/**
	 * The feature id for the '<em><b>Match Days</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__MATCH_DAYS = 2;

	/**
	 * The feature id for the '<em><b>Standing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__STANDING = 3;

	/**
	 * The number of structural features of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link soccer.impl.MatchDayImpl <em>Match Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soccer.impl.MatchDayImpl
	 * @see soccer.impl.SoccerPackageImpl#getMatchDay()
	 * @generated
	 */
	int MATCH_DAY = 4;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_DAY__DATE = 0;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_DAY__MATCHES = 1;

	/**
	 * The feature id for the '<em><b>Season</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_DAY__SEASON = 2;

	/**
	 * The number of structural features of the '<em>Match Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_DAY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Match Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_DAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link soccer.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soccer.impl.TeamImpl
	 * @see soccer.impl.SoccerPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 6;

	/**
	 * The meta object id for the '{@link soccer.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soccer.impl.PlayerImpl
	 * @see soccer.impl.SoccerPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 7;

	/**
	 * The meta object id for the '{@link soccer.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soccer.impl.MatchImpl
	 * @see soccer.impl.SoccerPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 5;

	/**
	 * The feature id for the '<em><b>Match Day</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__MATCH_DAY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__ID = 1;

	/**
	 * The feature id for the '<em><b>Home Team Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__HOME_TEAM_GOAL = 2;

	/**
	 * The feature id for the '<em><b>Away Team Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__AWAY_TEAM_GOAL = 3;

	/**
	 * The feature id for the '<em><b>Winner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__WINNER = 4;

	/**
	 * The feature id for the '<em><b>Opponents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__OPPONENTS = 5;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__SHORT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__PLAYERS = 3;

	/**
	 * The feature id for the '<em><b>League</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__LEAGUE = 4;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__WEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Team</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__TEAM = 4;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__POS_X = 5;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__POS_Y = 6;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link soccer.impl.OpponentImpl <em>Opponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soccer.impl.OpponentImpl
	 * @see soccer.impl.SoccerPackageImpl#getOpponent()
	 * @generated
	 */
	int OPPONENT = 8;

	/**
	 * The feature id for the '<em><b>Match</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPONENT__MATCH = 0;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPONENT__TEAM = 1;

	/**
	 * The feature id for the '<em><b>Opponent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPONENT__OPPONENT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Opponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Opponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPONENT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link soccer.impl.StandingImpl <em>Standing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soccer.impl.StandingImpl
	 * @see soccer.impl.SoccerPackageImpl#getStanding()
	 * @generated
	 */
	int STANDING = 9;

	/**
	 * The feature id for the '<em><b>Placements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING__PLACEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Season</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING__SEASON = 1;

	/**
	 * The number of structural features of the '<em>Standing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Standing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link soccer.impl.PlacementImpl <em>Placement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soccer.impl.PlacementImpl
	 * @see soccer.impl.SoccerPackageImpl#getPlacement()
	 * @generated
	 */
	int PLACEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Away Team Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT__AWAY_TEAM_GOAL = 1;

	/**
	 * The feature id for the '<em><b>Home Team Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT__HOME_TEAM_GOAL = 2;

	/**
	 * The feature id for the '<em><b>Goal Difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT__GOAL_DIFFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Wins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT__WINS = 4;

	/**
	 * The feature id for the '<em><b>Losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT__LOSSES = 5;

	/**
	 * The feature id for the '<em><b>Draws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT__DRAWS = 6;

	/**
	 * The feature id for the '<em><b>Season Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT__SEASON_POINTS = 7;

	/**
	 * The feature id for the '<em><b>Team Api Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT__TEAM_API_ID = 8;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT__TEAM = 9;

	/**
	 * The number of structural features of the '<em>Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link soccer.MatchWinner <em>Match Winner</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soccer.MatchWinner
	 * @see soccer.impl.SoccerPackageImpl#getMatchWinner()
	 * @generated
	 */
	int MATCH_WINNER = 11;


	/**
	 * Returns the meta object for class '{@link soccer.Sport <em>Sport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sport</em>'.
	 * @see soccer.Sport
	 * @generated
	 */
	EClass getSport();

	/**
	 * Returns the meta object for the containment reference list '{@link soccer.Sport#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Countries</em>'.
	 * @see soccer.Sport#getCountries()
	 * @see #getSport()
	 * @generated
	 */
	EReference getSport_Countries();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Sport#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see soccer.Sport#getName()
	 * @see #getSport()
	 * @generated
	 */
	EAttribute getSport_Name();

	/**
	 * Returns the meta object for class '{@link soccer.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see soccer.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Country#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see soccer.Country#getId()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Id();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Country#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see soccer.Country#getName()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Name();

	/**
	 * Returns the meta object for the containment reference '{@link soccer.Country#getLeague <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>League</em>'.
	 * @see soccer.Country#getLeague()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_League();

	/**
	 * Returns the meta object for the container reference '{@link soccer.Country#getSport <em>Sport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sport</em>'.
	 * @see soccer.Country#getSport()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Sport();

	/**
	 * Returns the meta object for class '{@link soccer.League <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>League</em>'.
	 * @see soccer.League
	 * @generated
	 */
	EClass getLeague();

	/**
	 * Returns the meta object for the attribute '{@link soccer.League#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see soccer.League#getId()
	 * @see #getLeague()
	 * @generated
	 */
	EAttribute getLeague_Id();

	/**
	 * Returns the meta object for the attribute '{@link soccer.League#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see soccer.League#getName()
	 * @see #getLeague()
	 * @generated
	 */
	EAttribute getLeague_Name();

	/**
	 * Returns the meta object for the container reference '{@link soccer.League#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Country</em>'.
	 * @see soccer.League#getCountry()
	 * @see #getLeague()
	 * @generated
	 */
	EReference getLeague_Country();

	/**
	 * Returns the meta object for the containment reference list '{@link soccer.League#getSeasons <em>Seasons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seasons</em>'.
	 * @see soccer.League#getSeasons()
	 * @see #getLeague()
	 * @generated
	 */
	EReference getLeague_Seasons();

	/**
	 * Returns the meta object for the containment reference list '{@link soccer.League#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teams</em>'.
	 * @see soccer.League#getTeams()
	 * @see #getLeague()
	 * @generated
	 */
	EReference getLeague_Teams();

	/**
	 * Returns the meta object for class '{@link soccer.Season <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Season</em>'.
	 * @see soccer.Season
	 * @generated
	 */
	EClass getSeason();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Season#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see soccer.Season#getName()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_Name();

	/**
	 * Returns the meta object for the container reference '{@link soccer.Season#getLeague <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>League</em>'.
	 * @see soccer.Season#getLeague()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_League();

	/**
	 * Returns the meta object for the containment reference list '{@link soccer.Season#getMatchDays <em>Match Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Match Days</em>'.
	 * @see soccer.Season#getMatchDays()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_MatchDays();

	/**
	 * Returns the meta object for the containment reference '{@link soccer.Season#getStanding <em>Standing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standing</em>'.
	 * @see soccer.Season#getStanding()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_Standing();

	/**
	 * Returns the meta object for class '{@link soccer.MatchDay <em>Match Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Day</em>'.
	 * @see soccer.MatchDay
	 * @generated
	 */
	EClass getMatchDay();

	/**
	 * Returns the meta object for the attribute '{@link soccer.MatchDay#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see soccer.MatchDay#getDate()
	 * @see #getMatchDay()
	 * @generated
	 */
	EAttribute getMatchDay_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link soccer.MatchDay#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matches</em>'.
	 * @see soccer.MatchDay#getMatches()
	 * @see #getMatchDay()
	 * @generated
	 */
	EReference getMatchDay_Matches();

	/**
	 * Returns the meta object for the container reference '{@link soccer.MatchDay#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Season</em>'.
	 * @see soccer.MatchDay#getSeason()
	 * @see #getMatchDay()
	 * @generated
	 */
	EReference getMatchDay_Season();

	/**
	 * Returns the meta object for class '{@link soccer.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see soccer.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Team#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see soccer.Team#getId()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Id();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Team#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see soccer.Team#getName()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Name();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Team#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see soccer.Team#getShortName()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_ShortName();

	/**
	 * Returns the meta object for the containment reference list '{@link soccer.Team#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see soccer.Team#getPlayers()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Players();

	/**
	 * Returns the meta object for the container reference '{@link soccer.Team#getLeague <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>League</em>'.
	 * @see soccer.Team#getLeague()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_League();

	/**
	 * Returns the meta object for class '{@link soccer.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see soccer.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Player#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see soccer.Player#getId()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Id();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see soccer.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Player#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see soccer.Player#getHeight()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Height();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Player#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see soccer.Player#getWeight()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Weight();

	/**
	 * Returns the meta object for the container reference '{@link soccer.Player#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Team</em>'.
	 * @see soccer.Player#getTeam()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Team();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Player#getPosX <em>Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos X</em>'.
	 * @see soccer.Player#getPosX()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_PosX();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Player#getPosY <em>Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Y</em>'.
	 * @see soccer.Player#getPosY()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_PosY();

	/**
	 * Returns the meta object for class '{@link soccer.Opponent <em>Opponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opponent</em>'.
	 * @see soccer.Opponent
	 * @generated
	 */
	EClass getOpponent();

	/**
	 * Returns the meta object for the container reference '{@link soccer.Opponent#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Match</em>'.
	 * @see soccer.Opponent#getMatch()
	 * @see #getOpponent()
	 * @generated
	 */
	EReference getOpponent_Match();

	/**
	 * Returns the meta object for the reference '{@link soccer.Opponent#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see soccer.Opponent#getTeam()
	 * @see #getOpponent()
	 * @generated
	 */
	EReference getOpponent_Team();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Opponent#getOpponentType <em>Opponent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opponent Type</em>'.
	 * @see soccer.Opponent#getOpponentType()
	 * @see #getOpponent()
	 * @generated
	 */
	EAttribute getOpponent_OpponentType();

	/**
	 * Returns the meta object for class '{@link soccer.Standing <em>Standing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standing</em>'.
	 * @see soccer.Standing
	 * @generated
	 */
	EClass getStanding();

	/**
	 * Returns the meta object for the containment reference list '{@link soccer.Standing#getPlacements <em>Placements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Placements</em>'.
	 * @see soccer.Standing#getPlacements()
	 * @see #getStanding()
	 * @generated
	 */
	EReference getStanding_Placements();

	/**
	 * Returns the meta object for the container reference '{@link soccer.Standing#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Season</em>'.
	 * @see soccer.Standing#getSeason()
	 * @see #getStanding()
	 * @generated
	 */
	EReference getStanding_Season();

	/**
	 * Returns the meta object for class '{@link soccer.Placement <em>Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placement</em>'.
	 * @see soccer.Placement
	 * @generated
	 */
	EClass getPlacement();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Placement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see soccer.Placement#getName()
	 * @see #getPlacement()
	 * @generated
	 */
	EAttribute getPlacement_Name();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Placement#getAwayTeamGoal <em>Away Team Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Away Team Goal</em>'.
	 * @see soccer.Placement#getAwayTeamGoal()
	 * @see #getPlacement()
	 * @generated
	 */
	EAttribute getPlacement_AwayTeamGoal();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Placement#getHomeTeamGoal <em>Home Team Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Team Goal</em>'.
	 * @see soccer.Placement#getHomeTeamGoal()
	 * @see #getPlacement()
	 * @generated
	 */
	EAttribute getPlacement_HomeTeamGoal();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Placement#getGoalDifference <em>Goal Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal Difference</em>'.
	 * @see soccer.Placement#getGoalDifference()
	 * @see #getPlacement()
	 * @generated
	 */
	EAttribute getPlacement_GoalDifference();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Placement#getWins <em>Wins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wins</em>'.
	 * @see soccer.Placement#getWins()
	 * @see #getPlacement()
	 * @generated
	 */
	EAttribute getPlacement_Wins();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Placement#getLosses <em>Losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Losses</em>'.
	 * @see soccer.Placement#getLosses()
	 * @see #getPlacement()
	 * @generated
	 */
	EAttribute getPlacement_Losses();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Placement#getDraws <em>Draws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Draws</em>'.
	 * @see soccer.Placement#getDraws()
	 * @see #getPlacement()
	 * @generated
	 */
	EAttribute getPlacement_Draws();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Placement#getSeasonPoints <em>Season Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Season Points</em>'.
	 * @see soccer.Placement#getSeasonPoints()
	 * @see #getPlacement()
	 * @generated
	 */
	EAttribute getPlacement_SeasonPoints();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Placement#getTeamApiId <em>Team Api Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Team Api Id</em>'.
	 * @see soccer.Placement#getTeamApiId()
	 * @see #getPlacement()
	 * @generated
	 */
	EAttribute getPlacement_TeamApiId();

	/**
	 * Returns the meta object for the reference '{@link soccer.Placement#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see soccer.Placement#getTeam()
	 * @see #getPlacement()
	 * @generated
	 */
	EReference getPlacement_Team();

	/**
	 * Returns the meta object for enum '{@link soccer.MatchWinner <em>Match Winner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Match Winner</em>'.
	 * @see soccer.MatchWinner
	 * @generated
	 */
	EEnum getMatchWinner();

	/**
	 * Returns the meta object for class '{@link soccer.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see soccer.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the container reference '{@link soccer.Match#getMatchDay <em>Match Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Match Day</em>'.
	 * @see soccer.Match#getMatchDay()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_MatchDay();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Match#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see soccer.Match#getId()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Id();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Match#getHomeTeamGoal <em>Home Team Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Team Goal</em>'.
	 * @see soccer.Match#getHomeTeamGoal()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_HomeTeamGoal();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Match#getAwayTeamGoal <em>Away Team Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Away Team Goal</em>'.
	 * @see soccer.Match#getAwayTeamGoal()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_AwayTeamGoal();

	/**
	 * Returns the meta object for the attribute '{@link soccer.Match#getWinner <em>Winner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Winner</em>'.
	 * @see soccer.Match#getWinner()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Winner();

	/**
	 * Returns the meta object for the containment reference list '{@link soccer.Match#getOpponents <em>Opponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Opponents</em>'.
	 * @see soccer.Match#getOpponents()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Opponents();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SoccerFactory getSoccerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link soccer.impl.SportImpl <em>Sport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soccer.impl.SportImpl
		 * @see soccer.impl.SoccerPackageImpl#getSport()
		 * @generated
		 */
		EClass SPORT = eINSTANCE.getSport();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPORT__COUNTRIES = eINSTANCE.getSport_Countries();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORT__NAME = eINSTANCE.getSport_Name();

		/**
		 * The meta object literal for the '{@link soccer.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soccer.impl.CountryImpl
		 * @see soccer.impl.SoccerPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__ID = eINSTANCE.getCountry_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__NAME = eINSTANCE.getCountry_Name();

		/**
		 * The meta object literal for the '<em><b>League</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__LEAGUE = eINSTANCE.getCountry_League();

		/**
		 * The meta object literal for the '<em><b>Sport</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__SPORT = eINSTANCE.getCountry_Sport();

		/**
		 * The meta object literal for the '{@link soccer.impl.LeagueImpl <em>League</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soccer.impl.LeagueImpl
		 * @see soccer.impl.SoccerPackageImpl#getLeague()
		 * @generated
		 */
		EClass LEAGUE = eINSTANCE.getLeague();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAGUE__ID = eINSTANCE.getLeague_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAGUE__NAME = eINSTANCE.getLeague_Name();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAGUE__COUNTRY = eINSTANCE.getLeague_Country();

		/**
		 * The meta object literal for the '<em><b>Seasons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAGUE__SEASONS = eINSTANCE.getLeague_Seasons();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAGUE__TEAMS = eINSTANCE.getLeague_Teams();

		/**
		 * The meta object literal for the '{@link soccer.impl.SeasonImpl <em>Season</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soccer.impl.SeasonImpl
		 * @see soccer.impl.SoccerPackageImpl#getSeason()
		 * @generated
		 */
		EClass SEASON = eINSTANCE.getSeason();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__NAME = eINSTANCE.getSeason_Name();

		/**
		 * The meta object literal for the '<em><b>League</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__LEAGUE = eINSTANCE.getSeason_League();

		/**
		 * The meta object literal for the '<em><b>Match Days</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__MATCH_DAYS = eINSTANCE.getSeason_MatchDays();

		/**
		 * The meta object literal for the '<em><b>Standing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__STANDING = eINSTANCE.getSeason_Standing();

		/**
		 * The meta object literal for the '{@link soccer.impl.MatchDayImpl <em>Match Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soccer.impl.MatchDayImpl
		 * @see soccer.impl.SoccerPackageImpl#getMatchDay()
		 * @generated
		 */
		EClass MATCH_DAY = eINSTANCE.getMatchDay();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH_DAY__DATE = eINSTANCE.getMatchDay_Date();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_DAY__MATCHES = eINSTANCE.getMatchDay_Matches();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_DAY__SEASON = eINSTANCE.getMatchDay_Season();

		/**
		 * The meta object literal for the '{@link soccer.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soccer.impl.TeamImpl
		 * @see soccer.impl.SoccerPackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__ID = eINSTANCE.getTeam_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__NAME = eINSTANCE.getTeam_Name();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__SHORT_NAME = eINSTANCE.getTeam_ShortName();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__PLAYERS = eINSTANCE.getTeam_Players();

		/**
		 * The meta object literal for the '<em><b>League</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__LEAGUE = eINSTANCE.getTeam_League();

		/**
		 * The meta object literal for the '{@link soccer.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soccer.impl.PlayerImpl
		 * @see soccer.impl.SoccerPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__ID = eINSTANCE.getPlayer_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__HEIGHT = eINSTANCE.getPlayer_Height();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__WEIGHT = eINSTANCE.getPlayer_Weight();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__TEAM = eINSTANCE.getPlayer_Team();

		/**
		 * The meta object literal for the '<em><b>Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__POS_X = eINSTANCE.getPlayer_PosX();

		/**
		 * The meta object literal for the '<em><b>Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__POS_Y = eINSTANCE.getPlayer_PosY();

		/**
		 * The meta object literal for the '{@link soccer.impl.OpponentImpl <em>Opponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soccer.impl.OpponentImpl
		 * @see soccer.impl.SoccerPackageImpl#getOpponent()
		 * @generated
		 */
		EClass OPPONENT = eINSTANCE.getOpponent();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPPONENT__MATCH = eINSTANCE.getOpponent_Match();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPPONENT__TEAM = eINSTANCE.getOpponent_Team();

		/**
		 * The meta object literal for the '<em><b>Opponent Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPPONENT__OPPONENT_TYPE = eINSTANCE.getOpponent_OpponentType();

		/**
		 * The meta object literal for the '{@link soccer.impl.StandingImpl <em>Standing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soccer.impl.StandingImpl
		 * @see soccer.impl.SoccerPackageImpl#getStanding()
		 * @generated
		 */
		EClass STANDING = eINSTANCE.getStanding();

		/**
		 * The meta object literal for the '<em><b>Placements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDING__PLACEMENTS = eINSTANCE.getStanding_Placements();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDING__SEASON = eINSTANCE.getStanding_Season();

		/**
		 * The meta object literal for the '{@link soccer.impl.PlacementImpl <em>Placement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soccer.impl.PlacementImpl
		 * @see soccer.impl.SoccerPackageImpl#getPlacement()
		 * @generated
		 */
		EClass PLACEMENT = eINSTANCE.getPlacement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEMENT__NAME = eINSTANCE.getPlacement_Name();

		/**
		 * The meta object literal for the '<em><b>Away Team Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEMENT__AWAY_TEAM_GOAL = eINSTANCE.getPlacement_AwayTeamGoal();

		/**
		 * The meta object literal for the '<em><b>Home Team Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEMENT__HOME_TEAM_GOAL = eINSTANCE.getPlacement_HomeTeamGoal();

		/**
		 * The meta object literal for the '<em><b>Goal Difference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEMENT__GOAL_DIFFERENCE = eINSTANCE.getPlacement_GoalDifference();

		/**
		 * The meta object literal for the '<em><b>Wins</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEMENT__WINS = eINSTANCE.getPlacement_Wins();

		/**
		 * The meta object literal for the '<em><b>Losses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEMENT__LOSSES = eINSTANCE.getPlacement_Losses();

		/**
		 * The meta object literal for the '<em><b>Draws</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEMENT__DRAWS = eINSTANCE.getPlacement_Draws();

		/**
		 * The meta object literal for the '<em><b>Season Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEMENT__SEASON_POINTS = eINSTANCE.getPlacement_SeasonPoints();

		/**
		 * The meta object literal for the '<em><b>Team Api Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEMENT__TEAM_API_ID = eINSTANCE.getPlacement_TeamApiId();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACEMENT__TEAM = eINSTANCE.getPlacement_Team();

		/**
		 * The meta object literal for the '{@link soccer.MatchWinner <em>Match Winner</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soccer.MatchWinner
		 * @see soccer.impl.SoccerPackageImpl#getMatchWinner()
		 * @generated
		 */
		EEnum MATCH_WINNER = eINSTANCE.getMatchWinner();

		/**
		 * The meta object literal for the '{@link soccer.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soccer.impl.MatchImpl
		 * @see soccer.impl.SoccerPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Match Day</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__MATCH_DAY = eINSTANCE.getMatch_MatchDay();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__ID = eINSTANCE.getMatch_Id();

		/**
		 * The meta object literal for the '<em><b>Home Team Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__HOME_TEAM_GOAL = eINSTANCE.getMatch_HomeTeamGoal();

		/**
		 * The meta object literal for the '<em><b>Away Team Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__AWAY_TEAM_GOAL = eINSTANCE.getMatch_AwayTeamGoal();

		/**
		 * The meta object literal for the '<em><b>Winner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__WINNER = eINSTANCE.getMatch_Winner();

		/**
		 * The meta object literal for the '<em><b>Opponents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__OPPONENTS = eINSTANCE.getMatch_Opponents();

	}

} //SoccerPackage
