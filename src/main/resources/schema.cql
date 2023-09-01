CREATE KEYSPACE IF NOT EXISTS docsmoxkeyspace
    WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

USE docsmoxkeyspace;

CREATE TABLE IF NOT EXISTS notes (
                                        id INT PRIMARY KEY,
                                        name TEXT,
                                        userId INT,
                                        title TEXT,
                                        wordcount float,
                                        content TEXT,
                                        timestamp DATE
);

CREATE TABLE IF NOT EXISTS spaces(
                                        id INT PRIMARY KEY,
                                        notesId INT,
                                        userId INT,
                                        subspacesId INT,
                                        teamsId INT,
                                        name TEXT,
                                        description TEXT,
                                        notescount float
);
CREATE TABLE IF NOT EXISTS subspaces(
                                        id INT PRIMARY KEY,
                                        notesId INT,
                                        userId INT,
                                        spacesId INT,
                                        teamsId INT,
                                        name TEXT,
                                        description TEXT,
                                        notescount float
);
CREATE TABLE IF NOT EXISTS teams(
                                        id INT PRIMARY KEY,
                                        notesId INT,
                                        userId INT,
                                        spacesId INT,
                                        subspacesId INT,
                                        name TEXT,
                                        description TEXT,
                                        usercount float
);
CREATE TABLE IF NOT EXISTS user(
                                    id UUID PRIMARY KEY,
                                    name TEXT,
                                    firstname TEXT,
                                    phonenumber TEXT,
                                    email TEXT,
                                    usercount float,
                                    teamsId INT,
                                    friendsId INT
);
