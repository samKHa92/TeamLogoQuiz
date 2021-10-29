package com.example.footballteamlogoquiz

object Constants {
    fun getSpainQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val Score: String = "0"

        val que1 = Question(
            1,
            "Which team uses this badge?",
            R.drawable.realmadrid,
            "Real Madrid",
            "Atletico Madrid",
            "Real Sociedad",
            "Real Betis",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "Which team uses this badge?",
            R.drawable.barcelona,
            "Villareal",
            "Rayo Vallecano",
            "Barcelona",
            "Athletic Bilbao",
            3
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "Which team uses this badge?",
            R.drawable.atleticomadrid,
            "Real Sociedad",
            "Atletico Madrid",
            "Athletic Bilbao",
            "Real Betis",
            2
        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "Which team uses this badge?",
            R.drawable.sevilla,
            "Real Betis",
            "Real Sociedad",
            "Sevilla",
            "Villareal",
            3
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "Which team uses this badge?",
            R.drawable.villareal,
            "Villareal",
            "Osasuna",
            "Valencia",
            "Cadiz",
            1
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "Which team uses this badge?",
            R.drawable.valencia,
            "Real Madrid",
            "Valencia",
            "Osasuna",
            "Real Betis",
            2
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "Which team uses this badge?",
            R.drawable.athleticbilbao,
            "Athletic Bilbao",
            "Atletico Madrid",
            "Reyo Vallecano",
            "Villareal",
            1
        )
        questionList.add(que7)

        val que8 = Question(
            8,
            "Which team uses this badge?",
            R.drawable.cadiz,
            "Real Sociedad",
            "Barcelona",
            "Espanyol",
            "Cadiz",
            4
        )
        questionList.add(que8)

        val que9 = Question(
            9,
            "Which team uses this badge?",
            R.drawable.espanyol,
            "Real Madrid",
            "Atletico Madrid",
            "Espanyol",
            "Real Betis",
            3
        )
        questionList.add(que9)

        val que10 = Question(
            10,
            "Which team uses this badge?",
            R.drawable.rayovallecano,
            "Real Betis",
            "Rayo Vallecano",
            "Alaves",
            "Barcelona",
            2
        )
        questionList.add(que10)

        val que11 = Question(
            11,
            "Which team uses this badge?",
            R.drawable.elche,
            "Osasuna",
            "Alaves",
            "Elche",
            "Real Sociedad",
            3
        )
        questionList.add(que11)

        val que12 = Question(
            12,
            "Which team uses this badge?",
            R.drawable.getafe,
            "Real Madrid",
            "Getafe",
            "Real Sociedad",
            "Espanyol",
            2
        )
        questionList.add(que12)

        val que13 = Question(
            13,
            "Which team uses this badge?",
            R.drawable.celtadevigo,
            "Alaves",
            "Celta De Vigo",
            "Elche",
            "Real Betis",
            2
        )
        questionList.add(que13)

        val que14 = Question(
            14,
            "Which team uses this badge?",
            R.drawable.mallorca,
            "Getafe",
            "Espanyol",
            "Rayo Vallecano",
            "Mallorca",
            4
        )
        questionList.add(que14)

        val que15 = Question(
            15,
            "Which team uses this badge?",
            R.drawable.granada,
            "Granada",
            "Atletico Madrid",
            "Real Sociedad",
            "Celta De Vigo",
            1
        )
        questionList.add(que15)

        val que16 = Question(
            16,
            "Which team uses this badge?",
            R.drawable.realsociedad,
            "Real Madrid",
            "Atletico Madrid",
            "Real Sociedad",
            "Real Betis",
            3
        )
        questionList.add(que16)

        val que17 = Question(
            17,
            "Which team uses this badge?",
            R.drawable.realbetis,
            "Real Betis",
            "Getafe",
            "Osasuna",
            "Real Madrid",
            1
        )
        questionList.add(que17)

        val que18 = Question(
            18,
            "Which team uses this badge?",
            R.drawable.osasuna,
            "Getafe",
            "Villareal",
            "Osasuna",
            "Real Sociedad",
            3
        )
        questionList.add(que18)

        val que19 = Question(
            19,
            "Which team uses this badge?",
            R.drawable.levante,
            "Bacelona",
            "Valencia",
            "Levante",
            "Celta De Vigo",
            3
        )
        questionList.add(que19)

        val que20 = Question(
            20,
            "Which team uses this badge?",
            R.drawable.alaves,
            "Elche",
            "Alaves",
            "Getafe",
            "Granada",
            2
        )
        questionList.add(que20)



        return questionList
    }



    fun getEnglandQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val Score: String = "0"

        val que1 = Question(
            1,
            "Which team uses this badge?",
            R.drawable.manutd,
            "Manchester United",
            "Manchester City",
            "Liverpool",
            "Norwich City",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "Which team uses this badge?",
            R.drawable.mancity,
            "Tottenham Hotspur",
            "Manchester City",
            "Chelsea",
            "Brighton",
            2
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "Which team uses this badge?",
            R.drawable.liverpool,
            "Chelsea",
            "Burnley",
            "Brentford",
            "Liverpool",
            4
        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "Which team uses this badge?",
            R.drawable.chelsea,
            "Everton",
            "Chelsea",
            "Crystal Palace",
            "Arsenal",
            2
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "Which team uses this badge?",
            R.drawable.arsenal,
            "Crystal Palace",
            "Arsenal",
            "Everton",
            "Leeds United",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "Which team uses this badge?",
            R.drawable.tottenham,
            "Crystal Palace",
            "Everton",
            "Tottenham Hotspur",
            "Liverpool",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "Which team uses this badge?",
            R.drawable.westham,
            "West Ham United",
            "Brentford",
            "Manchester City",
            "Leicester City",
            1
        )
        questionList.add(que7)

        val que8 = Question(
            8,
            "Which team uses this badge?",
            R.drawable.brighton,
            "Newcastle United",
            "Norwich City",
            "Leeds united",
            "Brighton",
            4
        )
        questionList.add(que8)

        val que9 = Question(
            9,
            "Which team uses this badge?",
            R.drawable.everton,
            "Wolverhampton",
            "Liverpool",
            "Everton",
            "Crystal Palace",
            3
        )
        questionList.add(que9)

        val que10 = Question(
            10,
            "Which team uses this badge?",
            R.drawable.leicester,
            "Norwich City",
            "Leicester City",
            "Watford",
            "Liverpool",
            2
        )
        questionList.add(que10)

        val que11 = Question(
            11,
            "Which team uses this badge?",
            R.drawable.wolves,
            "Wolverhampton",
            "Watford",
            "West Ham United",
            "Norwich City",
            1
        )
        questionList.add(que11)

        val que12 = Question(
            12,
            "Which team uses this badge?",
            R.drawable.brentford,
            "Manchester United",
            "Brentford",
            "Southampton",
            "Burnley",
            2
        )
        questionList.add(que12)

        val que13 = Question(
            13,
            "Which team uses this badge?",
            R.drawable.astonvilla,
            "Tottenham Hotspur",
            "Aston Villa",
            "Leeds United",
            "Watford",
            2
        )
        questionList.add(que13)

        val que14 = Question(
            14,
            "Which team uses this badge?",
            R.drawable.watford,
            "Watford",
            "Crystal Palace",
            "Newcastle United",
            "Brighton",
            1
        )
        questionList.add(que14)

        val que15 = Question(
            15,
            "Which team uses this badge?",
            R.drawable.crystalpalace,
            "Manchester City",
            "Newcastle United",
            "Tottenham Hotspur",
            "Crystal Palace",
            4
        )
        questionList.add(que15)

        val que16 = Question(
            16,
            "Which team uses this badge?",
            R.drawable.southampton,
            "Arsenal",
            "Watford",
            "Southampton",
            "Wolverhampton",
            3
        )
        questionList.add(que16)

        val que17 = Question(
            17,
            "Which team uses this badge?",
            R.drawable.leeds,
            "Chelsea",
            "Leeds United",
            "Crystal Palace",
            "Everton",
            2
        )
        questionList.add(que17)

        val que18 = Question(
            18,
            "Which team uses this badge?",
            R.drawable.burnley,
            "Norwich City",
            "Tottenham Hotspur",
            "Burnley",
            "Aston Villa",
            3
        )
        questionList.add(que18)

        val que19 = Question(
            19,
            "Which team uses this badge?",
            R.drawable.newcastle,
            "West Ham United",
            "Leeds United",
            "Newcastle United",
            "Manchester United",
            3
        )
        questionList.add(que19)

        val que20 = Question(
            20,
            "Which team uses this badge?",
            R.drawable.norwich,
            "Manchester City",
            "Norwich City",
            "Leicester City",
            "Burnley",
            2
        )
        questionList.add(que20)



        return questionList
    }
}