
CREATE Table Web_user(
    Web_User_ID varchar(5),
    First_Name varchar(15), 
    Last_Name varchar(20),
    Email_ID varchar(30),
    Phone_Number varchar(10) NOT NULL,
    Is_Manager boolean,
    Primary Key(Web_User_ID)
);


Create Table Artist(
    Artist_ID varchar(5),
    Artist_Name varchar(30) NOT NULL,
    Primary Key(Artist_Name)
);


Create Table Show(
    Show_ID int,
    Show_Time TIME,
    Show_Location varchar(30) NOT NULL,
    Avaliable_seats int,
    Art_Name varchar(30) NOT NULL,
    Primary Key(Show_ID),
    CONSTRAINT fk_artName
    Foreign Key(Art_Name) 
        REFERENCES Artist(Artist_Name) 
            ON DELETE CASCADE ON UPDATE CASCADE
);


Create Table Order(
    Order_ID int,
    Num_seats int,
    Primary Key(Order_ID),
    Foreign Key (Web_User_ID) REFERENCES Web_User(Web_User_ID) ON DELETE CASCADE ON UPDATE CASCADE,
    Foreign Key (Show_ID) REFERENCES Show(Show_ID) ON DELETE CASCADE ON UPDATE CASCADE
);


Create Table Seat(
    Seat_ID int,
    Seat_Avaliable boolean,
    Unmarked_Seats boolean,
    Foreign Key (Show_ID) REFERENCES Show(Show_ID) ON DELETE CASCADE ON UPDATE CASCADE
);


Create Table Review(
    Review_ID int,
    Content varchar(200),
    Primary Key(Review_ID),
    Foreign Key (User_ID) REFERENCES Web_User(Web_User_ID) ON DELETE CASCADE ON UPDATE CASCADE,
    Foreign Key (Show_ID) REFERENCES Show(Show_ID) ON DELETE CASCADE ON UPDATE CASCADE
);



INSERT INTO Artist (Artist_ID, Artist_Name) 
	VALUES (1, 'Ed Sheeran'),
     (2, 'Shakira'),
     (3, 'Beyonce'),
     (4, 'Dylan');

INSERT INTO Show(Show_ID, Show_Time, Show_Location, Avaliable_seats, Artist_Name)
    VALUES 
    
    
    INSERT INTO show (show_id, show_time, show_location, avaliable_seats, art_name) 
	VALUES (1, CURRENT_TIME, 'LA', 50, 'Dylan')

    
    
    
    
    (1, 2023-03-25, 'TLV', 7, 'Ed Sheeran'),
    (2, 2023-03-25, 'LA',  7, 'Ed Sheeran'),
    (3, 2023-03-26, 'NY', 6, 'Ed Sheeran'),
    (4, 2023-03-26, 'JLM', 5, 'Shakira'),
    (5, 2023-03-26, 'TLV', 5, 'Shakira'),
    (6, 2023-03-26, 'LA', 400, 'Beyonce'),
    (7, 2023-03-26, 'NY', 66, 'Beyonce'),
    (8, 2023-03-26, 'JLM', 800, 'Dylan');
