## Getting Started

Welcome to my project. Here is a guideline to help you take it easy.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Database Note

- I use MySQL local host by rootUser, path to connect in lib folder, it look like this:
    
    DB_URL = "jdbc:mysql://localhost:PortNumber/DatabaseName";
    USER = "UserName";
    PASS = "Password";

- Database fields:
    TABLE media
        Field       Type            Null    Default
    
        type        varchar(255)    yes     null
        id          int             no      null
        title       varchar(255)    yes     null
        category    varchar(255)    yes     null
        cost        float           no      null

    TABLE book
        Field       Type            Null    Default
    
        type        varchar(255)    yes     null
        id          int             no      null
        title       varchar(255)    yes     null
        category    varchar(255)    yes     null
        authorslist varchar(255)    yes     null
        cost        float           no      null
        content     text            yes     null
    
    TABLE authorslist
        Field       Type            Null    Default
        authorslist varchar(255)    yes     null
        author      varchar(255)    yes     null
    
    TABLE digitalvideodisc
        Field       Type            Null    Default
    
        type        varchar(255)    yes     null
        id          int             no      null
        title       varchar(255)    yes     null
        category    varchar(255)    yes     null
        director    varchar(255)    yes     null
        length      float           no      null
        cost        float           no      null

    TABLE compactdisc
        Field       Type            Null    Default

        type        varchar(255)    yes     null
        id          int             no      null
        title       varchar(255)    yes     null
        category    varchar(255)    yes     null
        director    varchar(255)    yes     null
        artist      varchar(255)    yes     null
        length      float           no      null
        cost        float           no      null

    TABLE tracklist
        Field       Type            Null    Default

        id          int             no      null
        title       varchar(255)    yes     null        
        length      float           no      null

- You can download MySQl at home page: https://www.mysql.com/downloads/

## Note

It's not final version, i will update early. Thank you, follow me if you like this project.