package com.example.assignment_three

import com.google.gson.GsonBuilder

class JsonData {
    companion object{
       var movies =  "{\n" +
               "  \"page\": 1,\n" +
               "  \"total_results\": 7785,\n" +
               "  \"total_pages\": 390,\n" +
               "  \"results\": [\n" +
               "    {\n" +
               "      \"popularity\": 13.503,\n" +
               "      \"vote_count\": 754,\n" +
               "      \"video\": false,\n" +
               "      \"poster_path\": \"/pci1ArYW7oJ2eyTo2NMYEKHHiCP.jpg\",\n" +
               "      \"id\": 724089,\n" +
               "      \"adult\": false,\n" +
               "      \"backdrop_path\": \"/jtAI6OJIWLWiRItNSZoWjrsUtmi.jpg\",\n" +
               "      \"original_language\": \"en\",\n" +
               "      \"original_title\": \"Gabriel's Inferno Part II\",\n" +
               "      \"genre_ids\": [\n" +
               "        10749\n" +
               "      ],\n" +
               "      \"title\": \"Gabriel's Inferno Part II\",\n" +
               "      \"vote_average\": 9.1,\n" +
               "      \"overview\": \"Professor Gabriel Emerson finally learns the truth about Julia Mitchell's identity, but his realization comes a moment too late. Julia is done waiting for the well-respected Dante specialist to remember her and wants nothing more to do with him. Can Gabriel win back her heart before she finds love in another's arms?\",\n" +
               "      \"release_date\": \"2020-07-31\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 12.955,\n" +
               "      \"vote_count\": 1342,\n" +
               "      \"video\": false,\n" +
               "      \"poster_path\": \"/oyG9TL7FcRP4EZ9Vid6uKzwdndz.jpg\",\n" +
               "      \"id\": 696374,\n" +
               "      \"adult\": false,\n" +
               "      \"backdrop_path\": \"/969BfPHGJcjg2aUv60g5uiiXFzf.jpg\",\n" +
               "      \"original_language\": \"en\",\n" +
               "      \"original_title\": \"Gabriel's Inferno\",\n" +
               "      \"genre_ids\": [\n" +
               "        10749\n" +
               "      ],\n" +
               "      \"title\": \"Gabriel's Inferno\",\n" +
               "      \"vote_average\": 9,\n" +
               "      \"overview\": \"An intriguing and sinful exploration of seduction, forbidden love, and redemption, Gabriel's Inferno is a captivating and wildly passionate tale of one man's escape from his own personal hell as he tries to earn the impossible--forgiveness and love.\",\n" +
               "      \"release_date\": \"2020-05-29\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 74.91,\n" +
               "      \"vote_count\": 364,\n" +
               "      \"video\": false,\n" +
               "      \"poster_path\": \"/zGVbrulkupqpbwgiNedkJPyQum4.jpg\",\n" +
               "      \"id\": 592350,\n" +
               "      \"adult\": false,\n" +
               "      \"backdrop_path\": \"/9guoVF7zayiiUq5ulKQpt375VIy.jpg\",\n" +
               "      \"original_language\": \"ja\",\n" +
               "      \"original_title\": \"??????????? THE MOVIE ?????:?????\",\n" +
               "      \"genre_ids\": [\n" +
               "        28,\n" +
               "        16\n" +
               "      ],\n" +
               "      \"title\": \"My Hero Academia: Heroes Rising\",\n" +
               "      \"vote_average\": 8.7,\n" +
               "      \"overview\": \"Class 1-A visits Nabu Island where they finally get to do some real hero work. The place is so peaceful that it's more like a vacation … until they're attacked by a villain with an unfathomable Quirk! His power is eerily familiar, and it looks like Shigaraki had a hand in the plan. But with All Might retired and citizens' lives on the line, there's no time for questions. Deku and his friends are the next generation of heroes, and they're the island's only hope.\",\n" +
               "      \"release_date\": \"2019-12-20\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 19.233,\n" +
               "      \"vote_count\": 2349,\n" +
               "      \"video\": false,\n" +
               "      \"poster_path\": \"/2CAL2433ZeIihfX1Hb2139CX0pW.jpg\",\n" +
               "      \"id\": 19404,\n" +
               "      \"adult\": false,\n" +
               "      \"backdrop_path\": \"/svYzz6A6xleZv5toTLAhigXd1DX.jpg\",\n" +
               "      \"original_language\": \"hi\",\n" +
               "      \"original_title\": \"??????? ????????? ?? ???????\",\n" +
               "      \"genre_ids\": [\n" +
               "        35,\n" +
               "        18,\n" +
               "        10749\n" +
               "      ],\n" +
               "      \"title\": \"Dilwale Dulhania Le Jayenge\",\n" +
               "      \"vote_average\": 8.7,\n" +
               "      \"overview\": \"Raj is a rich, carefree, happy-go-lucky second generation NRI. Simran is the daughter of Chaudhary Baldev Singh, who in spite of being an NRI is very strict about adherence to Indian values. Simran has left for India to be married to her childhood fiancé. Raj leaves for India with a mission at his hands, to claim his lady love under the noses of her whole family. Thus begins a saga.\",\n" +
               "      \"release_date\": \"1995-10-20\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 47.078,\n" +
               "      \"vote_count\": 17087,\n" +
               "      \"video\": false,\n" +
               "      \"poster_path\": \"/5KCVkau1HEl7ZzfPsKAPM0sMiKc.jpg\",\n" +
               "      \"id\": 278,\n" +
               "      \"adult\": false,\n" +
               "      \"backdrop_path\": \"/iNh3BivHyg5sQRPP1KOkzguEX0H.jpg\",\n" +
               "      \"original_language\": \"en\",\n" +
               "      \"original_title\": \"The Shawshank Redemption\",\n" +
               "      \"genre_ids\": [\n" +
               "        80,\n" +
               "        18\n" +
               "      ],\n" +
               "      \"title\": \"The Shawshank Redemption\",\n" +
               "      \"vote_average\": 8.7,\n" +
               "      \"overview\": \"Framed in the 1940s for the double murder of his wife and her lover, upstanding banker Andy Dufresne begins a new life at the Shawshank prison, where he puts his accounting skills to work for an amoral warden. During his long stretch in prison, Dufresne comes to be admired by the other inmates -- including an older prisoner named Red -- for his integrity and unquenchable sense of hope.\",\n" +
               "      \"release_date\": \"1994-09-23\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 51.844,\n" +
               "      \"vote_count\": 12925,\n" +
               "      \"video\": false,\n" +
               "      \"poster_path\": \"/3bhkrj58Vtu7enYsRolD1fZdja1.jpg\",\n" +
               "      \"id\": 238,\n" +
               "      \"adult\": false,\n" +
               "      \"backdrop_path\": \"/41xIKcLiM5ryfz4C9sZFcBOJGsK.jpg\",\n" +
               "      \"original_language\": \"en\",\n" +
               "      \"original_title\": \"The Godfather\",\n" +
               "      \"genre_ids\": [\n" +
               "        80,\n" +
               "        18\n" +
               "      ],\n" +
               "      \"title\": \"The Godfather\",\n" +
               "      \"vote_average\": 8.7,\n" +
               "      \"overview\": \"Spanning the years 1945 to 1955, a chronicle of the fictional Italian-American Corleone crime family. When organized crime family patriarch, Vito Corleone barely survives an attempt on his life, his youngest son, Michael steps in to take care of the would-be killers, launching a campaign of bloody revenge.\",\n" +
               "      \"release_date\": \"1972-03-14\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 32.133,\n" +
               "      \"vote_count\": 10274,\n" +
               "      \"video\": false,\n" +
               "      \"poster_path\": \"/t7xhP8SQTVanzecvn1oQRVWCXTI.jpg\",\n" +
               "      \"id\": 424,\n" +
               "      \"adult\": false,\n" +
               "      \"backdrop_path\": \"/loRmRzQXZeqG78TqZuyvSlEQfZb.jpg\",\n" +
               "      \"original_language\": \"en\",\n" +
               "      \"original_title\": \"Schindler's List\",\n" +
               "      \"genre_ids\": [\n" +
               "        18,\n" +
               "        36,\n" +
               "        10752\n" +
               "      ],\n" +
               "      \"title\": \"Schindler's List\",\n" +
               "      \"vote_average\": 8.6,\n" +
               "      \"overview\": \"The true story of how businessman Oskar Schindler saved over a thousand Jewish lives from the Nazis while they worked as slaves in his factory during World War II.\",\n" +
               "      \"release_date\": \"1993-11-30\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 144.528,\n" +
               "      \"vote_count\": 6299,\n" +
               "      \"video\": false,\n" +
               "      \"poster_path\": \"/q719jXXEzOoYaps6babgKnONONX.jpg\",\n" +
               "      \"id\": 372058,\n" +
               "      \"adult\": false,\n" +
               "      \"backdrop_path\": \"/mMtUybQ6hL24FXo0F3Z4j2KG7kZ.jpg\",\n" +
               "      \"original_language\": \"ja\",\n" +
               "      \"original_title\": \"?????\",\n" +
               "      \"genre_ids\": [\n" +
               "        16,\n" +
               "        18,\n" +
               "        10749\n" +
               "      ],\n" +
               "      \"title\": \"Your Name.\",\n" +
               "      \"vote_average\": 8.6,\n" +
               "      \"overview\": \"High schoolers Mitsuha and Taki are complete strangers living separate lives. But one night, they suddenly switch places. Mitsuha wakes up in Taki’s body, and he in hers. This bizarre occurrence continues to happen randomly, and the two must adjust their lives around each other.\",\n" +
               "      \"release_date\": \"2016-08-26\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 38.242,\n" +
               "      \"vote_count\": 7662,\n" +
               "      \"video\": false,\n" +
               "      \"poster_path\": \"/hek3koDUyRQk7FIhPXsa6mT2Zc3.jpg\",\n" +
               "      \"id\": 240,\n" +
               "      \"adult\": false,\n" +
               "      \"backdrop_path\": \"/poec6RqOKY9iSiIUmfyfPfiLtvB.jpg\",\n" +
               "      \"original_language\": \"en\",\n" +
               "      \"original_title\": \"The Godfather: Part II\",\n" +
               "      \"genre_ids\": [\n" +
               "        80,\n" +
               "        18\n" +
               "      ],\n" +
               "      \"title\": \"The Godfather: Part II\",\n" +
               "      \"vote_average\": 8.6,\n" +
               "      \"overview\": \"In the continuing saga of the Corleone crime family, a young Vito Corleone grows up in Sicily and in 1910s New York. In the 1950s, Michael Corleone attempts to expand the family business into Las Vegas, Hollywood and Cuba.\",\n" +
               "      \"release_date\": \"1974-12-20\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 7.776,\n" +
               "      \"vote_count\": 256,\n" +
               "      \"video\": false,\n" +
               "      \"poster_path\": \"/zGGWYpiKNwjpKxelPxOMqJnUgDs.jpg\",\n" +
               "      \"id\": 42269,\n" +
               "      \"adult\": false,\n" +
               "      \"backdrop_path\": \"/bh6yfB6I1N1WuMiX6K5HxGVZnja.jpg\",\n" +
               "      \"original_language\": \"it\",\n" +
               "      \"original_title\": \"C'eravamo tanto amati\",\n" +
               "      \"genre_ids\": [\n" +
               "        35,\n" +
               "        18\n" +
               "      ],\n" +
               "      \"title\": \"We All Loved Each Other So Much\",\n" +
               "      \"vote_average\": 8.5,\n" +
               "      \"overview\": \"Gianni, Nicola and Antonio become close friends in 1944 while fighting the Nazis. After the end of the war, full of illusions, they settle down. The movie is a the story of the life of these three idealists and how they deal with the inevitable disillusionments of life.\",\n" +
               "      \"release_date\": \"1974-12-21\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 130.9,\n" +
               "      \"vote_count\": 10109,\n" +
               "      \"video\": false,\n" +
               "      \"poster_path\": \"/2TeJfUZMGolfDdW6DKhfIWqvq8y.jpg\",\n" +
               "      \"id\": 129,\n" +
               "      \"adult\": false,\n" +
               "      \"backdrop_path\": \"/mSDsSDwaP3E7dEfUPWy4J0djt4O.jpg\",\n" +
               "      \"original_language\": \"ja\",\n" +
               "      \"original_title\": \"????????\",\n" +
               "      \"genre_ids\": [\n" +
               "        16,\n" +
               "        14,\n" +
               "        10751\n" +
               "      ],\n" +
               "      \"title\": \"Spirited Away\",\n" +
               "      \"vote_average\": 8.5,\n" +
               "      \"overview\": \"A young girl, Chihiro, becomes trapped in a strange new world of spirits. When her parents undergo a mysterious transformation, she must call upon the courage she never knew she had to free her family.\",\n" +
               "      \"release_date\": \"2001-07-20\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 166.429,\n" +
               "      \"vote_count\": 9122,\n" +
               "      \"video\": false,\n" +
               "      \"poster_path\": \"/7IiTTgloJzvGI1TAYymCfbfl3vT.jpg\",\n" +
               "      \"id\": 496243,\n" +
               "      \"adult\": false,\n" +
               "      \"backdrop_path\": \"/ApiBzeaa95TNYliSbQ8pJv4Fje7.jpg\",\n" +
               "      \"original_language\": \"ko\",\n" +
               "      \"original_title\": \"???\",\n" +
               "      \"genre_ids\": [\n" +
               "        35,\n" +
               "        18,\n" +
               "        53\n" +
               "      ],\n" +
               "      \"title\": \"Parasite\",\n" +
               "      \"vote_average\": 8.5,\n" +
               "      \"overview\": \"All unemployed, Ki-taek's family takes peculiar interest in the wealthy and glamorous Parks for their livelihood until they get entangled in an unexpected incident.\",\n" +
               "      \"release_date\": \"2019-05-30\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 41.262,\n" +
               "      \"id\": 522924,\n" +
               "      \"video\": false,\n" +
               "      \"vote_count\": 586,\n" +
               "      \"vote_average\": 8.5,\n" +
               "      \"title\": \"The Art of Racing in the Rain\",\n" +
               "      \"release_date\": \"2019-08-08\",\n" +
               "      \"original_language\": \"en\",\n" +
               "      \"original_title\": \"The Art of Racing in the Rain\",\n" +
               "      \"genre_ids\": [\n" +
               "        35,\n" +
               "        18,\n" +
               "        10749\n" +
               "      ],\n" +
               "      \"backdrop_path\": \"/6esNUoXh4xQvucB7o7e3TCfjI65.jpg\",\n" +
               "      \"adult\": false,\n" +
               "      \"overview\": \"A family dog—with a near-human soul and a philosopher's mind—evaluates his life through the lessons learned by his human owner, a race-car driver.\",\n" +
               "      \"poster_path\": \"/mi5VN4ww0JZgRFJIaPxxTGKjUg7.jpg\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 57.431,\n" +
               "      \"vote_count\": 400,\n" +
               "      \"video\": false,\n" +
               "      \"poster_path\": \"/h1B7tW0t399VDjAcWJh8m87469b.jpg\",\n" +
               "      \"id\": 556574,\n" +
               "      \"adult\": false,\n" +
               "      \"backdrop_path\": \"/uWVkEo9PWHu9algZsiLPi6sRU64.jpg\",\n" +
               "      \"original_language\": \"en\",\n" +
               "      \"original_title\": \"Hamilton\",\n" +
               "      \"genre_ids\": [\n" +
               "        18,\n" +
               "        36,\n" +
               "        10402\n" +
               "      ],\n" +
               "      \"title\": \"Hamilton\",\n" +
               "      \"vote_average\": 8.5,\n" +
               "      \"overview\": \"Presenting the tale of American founding father Alexander Hamilton, this filmed version of the original Broadway smash hit is the story of America then, told by America now.\",\n" +
               "      \"release_date\": \"2020-07-03\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 45.913,\n" +
               "      \"vote_count\": 10881,\n" +
               "      \"video\": false,\n" +
               "      \"poster_path\": \"/velWPhVMQeQKcxggNEU8YmIo52R.jpg\",\n" +
               "      \"id\": 497,\n" +
               "      \"adult\": false,\n" +
               "      \"backdrop_path\": \"/xMIyotorUv2Yz7zpQz2QYc8wkWB.jpg\",\n" +
               "      \"original_language\": \"en\",\n" +
               "      \"original_title\": \"The Green Mile\",\n" +
               "      \"genre_ids\": [\n" +
               "        80,\n" +
               "        18,\n" +
               "        14\n" +
               "      ],\n" +
               "      \"title\": \"The Green Mile\",\n" +
               "      \"vote_average\": 8.5,\n" +
               "      \"overview\": \"A supernatural tale set on death row in a Southern prison, where gentle giant John Coffey possesses the mysterious power to heal people's ailments. When the cell block's head guard, Paul Edgecomb, recognizes Coffey's miraculous gift, he tries desperately to help stave off the condemned man's execution.\",\n" +
               "      \"release_date\": \"1999-12-10\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 67.016,\n" +
               "      \"vote_count\": 445,\n" +
               "      \"video\": false,\n" +
               "      \"poster_path\": \"/8mRgpubxHqnqvENK4Bei30xMDvy.jpg\",\n" +
               "      \"id\": 537061,\n" +
               "      \"adult\": false,\n" +
               "      \"backdrop_path\": \"/re3ZvlKJg04iLpLRf1xTKHS2wLU.jpg\",\n" +
               "      \"original_language\": \"en\",\n" +
               "      \"original_title\": \"Steven Universe: The Movie\",\n" +
               "      \"genre_ids\": [\n" +
               "        28,\n" +
               "        12,\n" +
               "        16,\n" +
               "        35,\n" +
               "        18,\n" +
               "        14,\n" +
               "        10402,\n" +
               "        10751\n" +
               "      ],\n" +
               "      \"title\": \"Steven Universe: The Movie\",\n" +
               "      \"vote_average\": 8.5,\n" +
               "      \"overview\": \"Two years after the events of \\\"Change Your Mind\\\", Steven (now 16 years old) and his friends are ready to enjoy the rest of their lives peacefully. However, all of that changes when a new sinister Gem arrives, armed with a giant drill that saps the life force of all living things on Earth. In their biggest challenge ever, the Crystal Gems must work together to save all organic life on Earth within 48 hours.\",\n" +
               "      \"release_date\": \"2019-09-02\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 53.752,\n" +
               "      \"vote_count\": 19474,\n" +
               "      \"video\": false,\n" +
               "      \"poster_path\": \"/plnlrtBUULT0rh3Xsjmpubiso3L.jpg\",\n" +
               "      \"id\": 680,\n" +
               "      \"adult\": false,\n" +
               "      \"backdrop_path\": \"/52StM7zDmcjeKxWkW55X5LtoLQi.jpg\",\n" +
               "      \"original_language\": \"en\",\n" +
               "      \"original_title\": \"Pulp Fiction\",\n" +
               "      \"genre_ids\": [\n" +
               "        80,\n" +
               "        53\n" +
               "      ],\n" +
               "      \"title\": \"Pulp Fiction\",\n" +
               "      \"vote_average\": 8.5,\n" +
               "      \"overview\": \"A burger-loving hit man, his philosophical partner, a drug-addled gangster's moll and a washed-up boxer converge in this sprawling, comedic crime caper. Their adventures unfurl in three stories that ingeniously trip back and forth in time.\",\n" +
               "      \"release_date\": \"1994-09-10\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 34.109,\n" +
               "      \"id\": 637,\n" +
               "      \"video\": false,\n" +
               "      \"vote_count\": 9238,\n" +
               "      \"vote_average\": 8.5,\n" +
               "      \"title\": \"Life Is Beautiful\",\n" +
               "      \"release_date\": \"1997-12-20\",\n" +
               "      \"original_language\": \"it\",\n" +
               "      \"original_title\": \"La vita è bella\",\n" +
               "      \"genre_ids\": [\n" +
               "        35,\n" +
               "        18\n" +
               "      ],\n" +
               "      \"backdrop_path\": \"/6aNKD81RHR1DqUUa8kOZ1TBY1Lp.jpg\",\n" +
               "      \"adult\": false,\n" +
               "      \"overview\": \"A touching story of an Italian book seller of Jewish ancestry who lives in his own little fairy tale. His creative and happy life would come to an abrupt halt when his entire family is deported to a concentration camp during World War II. While locked up he tries to convince his son that the whole thing is just a game.\",\n" +
               "      \"poster_path\": \"/74hLDKjD5aGYOotO6esUVaeISa2.jpg\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 27.582,\n" +
               "      \"vote_count\": 4956,\n" +
               "      \"video\": false,\n" +
               "      \"poster_path\": \"/ppd84D2i9W8jXmsyInGyihiSyqz.jpg\",\n" +
               "      \"id\": 389,\n" +
               "      \"adult\": false,\n" +
               "      \"backdrop_path\": \"/qqHQsStV6exghCM7zbObuYBiYxw.jpg\",\n" +
               "      \"original_language\": \"en\",\n" +
               "      \"original_title\": \"12 Angry Men\",\n" +
               "      \"genre_ids\": [\n" +
               "        18\n" +
               "      ],\n" +
               "      \"title\": \"12 Angry Men\",\n" +
               "      \"vote_average\": 8.5,\n" +
               "      \"overview\": \"The defense and the prosecution have rested and the jury is filing into the jury room to decide if a young Spanish-American is guilty or innocent of murdering his father. What begins as an open and shut case soon becomes a mini-drama of each of the jurors' prejudices and preconceptions about the trial, the accused, and each other.\",\n" +
               "      \"release_date\": \"1957-04-10\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"popularity\": 55.424,\n" +
               "      \"vote_count\": 16190,\n" +
               "      \"video\": false,\n" +
               "      \"poster_path\": \"/rCzpDGLbOoPwLjy3OAm5NUPOTrC.jpg\",\n" +
               "      \"id\": 122,\n" +
               "      \"adult\": false,\n" +
               "      \"backdrop_path\": \"/lXhgCODAbBXL5buk9yEmTpOoOgR.jpg\",\n" +
               "      \"original_language\": \"en\",\n" +
               "      \"original_title\": \"The Lord of the Rings: The Return of the King\",\n" +
               "      \"genre_ids\": [\n" +
               "        28,\n" +
               "        12,\n" +
               "        14\n" +
               "      ],\n" +
               "      \"title\": \"The Lord of the Rings: The Return of the King\",\n" +
               "      \"vote_average\": 8.5,\n" +
               "      \"overview\": \"Aragorn is revealed as the heir to the ancient kings as he, Gandalf and the other members of the broken fellowship struggle to save Gondor from Sauron's forces. Meanwhile, Frodo and Sam take the ring closer to the heart of Mordor, the dark lord's realm.\",\n" +
               "      \"release_date\": \"2003-12-01\"\n" +
               "    }\n" +
               "  ]\n" +
               "}"

    }

}