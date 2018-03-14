package scouting.sciguy429.com.scoutingapp.Objects;

public class DBBAK {
    public String sql = ";             \n" +
            "CREATE USER IF NOT EXISTS JAVAADMIN SALT '60910cc8c1e3edc8' HASH '223fd9678b9436d6ca54c0e6908959c8e1f29e6ed2c6864864a46397b0f71f90' ADMIN;    \n" +
            "CREATE USER IF NOT EXISTS SA SALT '9e52b2e038d4dfa7' HASH 'ad5ab7703ca3c6f056ea056d1601d56db128cb4647f9318695c71a422882c390' ADMIN;           \n" +
            "CREATE CACHED TABLE PUBLIC.MATCHES(\n" +
            "    MATCH_NUMBER INTEGER NOT NULL,\n" +
            "    MATCH_R1_NUMBER INTEGER,\n" +
            "    MATCH_R1_CUBES_ON_SCALE INTEGER,\n" +
            "    MATCH_R1_CUBES_ON_SWITCH INTEGER,\n" +
            "    MATCH_R1_CUBES_IN_PORTAL INTEGER,\n" +
            "    MATCH_R1_CLIMB BOOLEAN,\n" +
            "    MATCH_R1_FELL BOOLEAN,\n" +
            "    MATCH_R1_FOULS INTEGER,\n" +
            "    MATCH_R1_CARDS INTEGER,\n" +
            "    MATCH_R1_COMMENT VARCHAR(512),\n" +
            "    MATCH_R2_NUMBER INTEGER,\n" +
            "    MATCH_R2_CUBES_ON_SCALE INTEGER,\n" +
            "    MATCH_R2_CUBES_ON_SWITCH INTEGER,\n" +
            "    MATCH_R2_CUBES_IN_PORTAL INTEGER,\n" +
            "    MATCH_R2_CLIMB BOOLEAN,\n" +
            "    MATCH_R2_FELL BOOLEAN,\n" +
            "    MATCH_R2_FOULS INTEGER,\n" +
            "    MATCH_R2_CARDS INTEGER,\n" +
            "    MATCH_R2_COMMENT VARCHAR(512),\n" +
            "    MATCH_R3_NUMBER INTEGER,\n" +
            "    MATCH_R3_CUBES_ON_SCALE INTEGER,\n" +
            "    MATCH_R3_CUBES_ON_SWITCH INTEGER,\n" +
            "    MATCH_R3_CUBES_IN_PORTAL INTEGER,\n" +
            "    MATCH_R3_CLIMB BOOLEAN,\n" +
            "    MATCH_R3_FELL BOOLEAN,\n" +
            "    MATCH_R3_FOULS INTEGER,\n" +
            "    MATCH_R3_CARDS INTEGER,\n" +
            "    MATCH_R3_COMMENT VARCHAR(512),\n" +
            "    MATCH_B1_NUMBER INTEGER,\n" +
            "    MATCH_B1_CUBES_ON_SCALE INTEGER,\n" +
            "    MATCH_B1_CUBES_ON_SWITCH INTEGER,\n" +
            "    MATCH_B1_CUBES_IN_PORTAL INTEGER,\n" +
            "    MATCH_B1_CLIMB BOOLEAN,\n" +
            "    MATCH_B1_FELL BOOLEAN,\n" +
            "    MATCH_B1_FOULS INTEGER,\n" +
            "    MATCH_B1_CARDS INTEGER,\n" +
            "    MATCH_B1_COMMENT VARCHAR(512),\n" +
            "    MATCH_B2_NUMBER INTEGER,\n" +
            "    MATCH_B2_CUBES_ON_SCALE INTEGER,\n" +
            "    MATCH_B2_CUBES_ON_SWITCH INTEGER,\n" +
            "    MATCH_B2_CUBES_IN_PORTAL INTEGER,\n" +
            "    MATCH_B2_CLIMB BOOLEAN,\n" +
            "    MATCH_B2_FELL BOOLEAN,\n" +
            "    MATCH_B2_FOULS INTEGER,\n" +
            "    MATCH_B2_CARDS INTEGER,\n" +
            "    MATCH_B2_COMMENT VARCHAR(512),\n" +
            "    MATCH_B3_NUMBER INTEGER,\n" +
            "    MATCH_B3_CUBES_ON_SCALE INTEGER,\n" +
            "    MATCH_B3_CUBES_ON_SWITCH INTEGER,\n" +
            "    MATCH_B3_CUBES_IN_PORTAL INTEGER,\n" +
            "    MATCH_B3_CLIMB BOOLEAN,\n" +
            "    MATCH_B3_FELL BOOLEAN,\n" +
            "    MATCH_B3_FOULS INTEGER,\n" +
            "    MATCH_B3_CARDS INTEGER,\n" +
            "    MATCH_B3_COMMENT VARCHAR(512)\n" +
            ");              \n" +
            "ALTER TABLE PUBLIC.MATCHES ADD CONSTRAINT PUBLIC.CONSTRAINT_5 PRIMARY KEY(MATCH_NUMBER);      \n" +
            "-- 0 +/- SELECT COUNT(*) FROM PUBLIC.MATCHES; \n" +
            "CREATE CACHED TABLE PUBLIC.TEAMS(\n" +
            "    TEAM_NUMBER INT NOT NULL,\n" +
            "    TEAM_NAME VARCHAR(512) NOT NULL,\n" +
            "    TEAM_DATA_DRIVE_TRAIN VARCHAR(512),\n" +
            "    TEAM_DATA_PICTURE_SERVER_URI VARCHAR(512),\n" +
            "    TEAM_DATA_PICTURE_CLIENT_URI VARCHAR(512),\n" +
            "    TEAM_DATA_HEIGHT FLOAT,\n" +
            "    TEAM_DATA_PLACE_ON_SCALE BOOLEAN,\n" +
            "    TEAM_DATA_PLACE_ON_SWITCH BOOLEAN,\n" +
            "    TEAM_DATA_CAN_CLIMB BOOLEAN,\n" +
            "    TEAM_DATA_PLACE_IN_PORTAL BOOLEAN,\n" +
            "    TEAM_DATA_PICKUP_IN_ANY_ORIENTATION BOOLEAN,\n" +
            "    TEAM_DATA_CUBE_PLACE_METHOD VARCHAR(512),\n" +
            "    TEAM_DATA_COMMENTS VARCHAR(512)\n" +
            ");               \n" +
            "ALTER TABLE PUBLIC.TEAMS ADD CONSTRAINT PUBLIC.CONSTRAINT_4C PRIMARY KEY(TEAM_NUMBER);        \n" +
            "-- 43 +/- SELECT COUNT(*) FROM PUBLIC.TEAMS;  \n" +
            "INSERT INTO PUBLIC.TEAMS(TEAM_NUMBER, TEAM_NAME, TEAM_DATA_DRIVE_TRAIN, TEAM_DATA_PICTURE_SERVER_URI, TEAM_DATA_PICTURE_CLIENT_URI, TEAM_DATA_HEIGHT, TEAM_DATA_PLACE_ON_SCALE, TEAM_DATA_PLACE_ON_SWITCH, TEAM_DATA_CAN_CLIMB, TEAM_DATA_PLACE_IN_PORTAL, TEAM_DATA_PICKUP_IN_ANY_ORIENTATION, TEAM_DATA_CUBE_PLACE_METHOD, TEAM_DATA_COMMENTS) VALUES\n" +
            "(932, 'Circuit Chargers', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(935, 'RaileRobotics', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(937, 'Robo Tribe', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(938, 'Code Gold', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1288, 'RAVEN Robotics', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1723, 'The FBI - FIRST Bots of Independence', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1737, 'Project X', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1763, 'Paseliens', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1764, 'Liberty Robotics', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1769, 'Digital Hawks', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1775, 'Tigerbytes', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1802, 'Team Stealth', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1825, 'The Cyborgs', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1827, 'THE HIVE', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1986, 'Team Titanium', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1987, 'Broncobots', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1997, 'Stag Robotics', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(2164, 'The Core', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(2345, 'Animal Control', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(2352, 'Metal Mayhem', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(2357, 'System Meltdown', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(2457, 'The Law', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(2560, 'RoboDog', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(2874, 'Iron Eagles', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(3172, 'HorsePOWER', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(3284, 'Camdenton LASER', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(4809, 'Black Knight Robotics', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(5013, 'Trobots', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(5082, 'Northmen Robotics', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(5098, 'STING - R', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(5126, 'Electromagnetic Panthers (E.M.P.)', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(5141, 'GRIFFINITE', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(5189, 'SABRE', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(5801, 'CTC Inspire', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(5809, 'The Jesubots', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(5889, 'Commandobots', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(5968, 'Cyborg Indians', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(6542, 'Technomancers', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(6805, 'Cyber Jays', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(6817, '10 Factorial', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(6886, 'Synthesizers', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(6976, 'Electric Eagles', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);               \n" +
            "INSERT INTO PUBLIC.TEAMS(TEAM_NUMBER, TEAM_NAME, TEAM_DATA_DRIVE_TRAIN, TEAM_DATA_PICTURE_SERVER_URI, TEAM_DATA_PICTURE_CLIENT_URI, TEAM_DATA_HEIGHT, TEAM_DATA_PLACE_ON_SCALE, TEAM_DATA_PLACE_ON_SWITCH, TEAM_DATA_CAN_CLIMB, TEAM_DATA_PLACE_IN_PORTAL, TEAM_DATA_PICKUP_IN_ANY_ORIENTATION, TEAM_DATA_CUBE_PLACE_METHOD, TEAM_DATA_COMMENTS) VALUES\n" +
            "(7064, 'Voltron Robotics', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);        \n";
    public DBBAK () {}
}
