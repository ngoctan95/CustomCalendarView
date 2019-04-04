# CustomCalendarView
Hi everyone, I'm Tan.
This is the first library which support multirange for UNCalendar view.

This will be updated more function in the nearest future. Dont be messed up with multirange, will be cool!
Contact me via gmail: nguyenngoctan44@gmail.com is any, or any pull request are welcome.

![alt text](http://oi67.tinypic.com/1628to8.jpg)

How to install:

***implementation 'com.github.ngoctan95:CustomCalendarView:{lastest-version}'***
    
How to use this lib:
    
    In xml file:
        <nguyenngoctan44.io.uranashel_multirangecalendarview.UNMultiRangeCalendarView
            android:id="@+id/calenderView"
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>
    In class:
    
      ```@Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);

        unMultiRangeCalendarView = findViewById(R.id.multiRangeUraNashelCalendar);

        List<CalendarCustomObject> calendarCustomObjects = new ArrayList<>();

        CalendarCustomObject calendarCustomObject = new CalendarCustomObject();
        UNCalendar unCalendar;

        calendarCustomObject.setType(Arrays.asList(types).get(0));
        calendarCustomObject.setColorBackground("#e4fffd");
        calendarCustomObject.setColorStroke("#00aa9c");
        unCalendar = new UNCalendar(2018, 12, 12);
        calendarCustomObject.setUNCalendar(unCalendar);
        calendarCustomObjects.add(calendarCustomObject);


        calendarCustomObject = new CalendarCustomObject();
        calendarCustomObject.setType(Arrays.asList(types).get(0));
        calendarCustomObject.setColorBackground("#e4fffd");
        calendarCustomObject.setColorStroke("#00aa9c");
        unCalendar = new UNCalendar(2019, 1, 30);
        calendarCustomObject.setUNCalendar(unCalendar);
        calendarCustomObjects.add(calendarCustomObject);

        calendarCustomObject = new CalendarCustomObject();
        calendarCustomObject.setType(Arrays.asList(types).get(0));
        calendarCustomObject.setColorBackground("#e4fffd");
        calendarCustomObject.setColorStroke("#00aa9c");
        unCalendar = new UNCalendar(2019, 1, 31);
        calendarCustomObject.setUNCalendar(unCalendar);
        calendarCustomObjects.add(calendarCustomObject);


        calendarCustomObject = new CalendarCustomObject();
        calendarCustomObject.setType(Arrays.asList(types).get(0));
        calendarCustomObject.setColorBackground("#e4fffd");
        calendarCustomObject.setColorStroke("#00aa9c");
        unCalendar = new UNCalendar(2019, 3, 12);
        calendarCustomObject.setUNCalendar(unCalendar);
        calendarCustomObjects.add(calendarCustomObject);


        LocalDate dateStart = new LocalDate("2019-3-26");
        LocalDate dateEnd = new LocalDate("2019-3-28");
        while (dateStart.isBefore(dateEnd) || dateStart.equals(dateEnd)) {

            calendarCustomObject = new CalendarCustomObject();

            calendarCustomObject.setType(Arrays.asList(types).get(2));
            calendarCustomObject.setColorBackground("#e4fffd");
            calendarCustomObject.setColorStroke("#00aa9c");

            calendarCustomObject.setUNCalendar(new UNCalendar(dateStart.getYear(), dateStart.getMonthOfYear(), dateStart.getDayOfMonth()));
            calendarCustomObjects.add(calendarCustomObject);
            dateStart = dateStart.plusDays(1);
        }

        LocalDate dateStart1 = new LocalDate("2019-3-29");
        LocalDate dateEnd1 = new LocalDate("2019-3-29");
        while (dateStart1.isBefore(dateEnd1) || dateStart1.equals(dateEnd1)) {

            calendarCustomObject = new CalendarCustomObject();

            calendarCustomObject.setType(Arrays.asList(types).get(1));
            calendarCustomObject.setColorBackground("#e4fffd");
            calendarCustomObject.setColorStroke("#00aa9c");

            calendarCustomObject.setUNCalendar(new UNCalendar(dateStart1.getYear(), dateStart1.getMonthOfYear(), dateStart1.getDayOfMonth()));
            calendarCustomObjects.add(calendarCustomObject);
            dateStart1 = dateStart1.plusDays(1);
        }


        unMultiRangeCalendarView.setCommonDatesDataInAMonth(calendarCustomObjects);
        unMultiRangeCalendarView.setColorBackgroundCalendar("#ffffff");
        unMultiRangeCalendarView.setTextSize(13);
        unMultiRangeCalendarView.setTextColor("#000000");
        unMultiRangeCalendarView.setStrokeColorCircle("#363636");
        unMultiRangeCalendarView.setVerticalSpacing(-60); // Any value what you want to reduce the spacing between row in gridview
        unMultiRangeCalendarView.build();
    }```

***Note: Do not use the color format with 3 characters. Let use with full 6 characters, like here: #xxxxxx, not #xxx


If you gonna change the language, please specify some values of string in xml file such as:

     ```<resources>
     
        <string name="mo">Mo</string>
        
        <string name="tu">Tu</string>
        
        <string name="we">We</string>
        
        <string name="th">Th</string>
        
        <string name="fr">Fr</string>
        
        <string name="sa">Sa</string>
        
        <string name="su">Su</string>
        
    </resources>```
    

