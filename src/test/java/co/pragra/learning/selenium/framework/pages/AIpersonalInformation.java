package co.pragra.learning.selenium.framework.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AIpersonalInformation {
    WebDriver driver;
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    //is application sibling who atten radio button
    // //input[@name='12P']
    ////input[@name='12Q']


    @FindBy(xpath = "//input[@name='12P']")
    private WebElement siblingAattayes;
    public AIpersonalInformation entersibling(String siblingAattayesv) {
        this.siblingAattayes.sendKeys();
        return this;
    }
    @FindBy(xpath = "//input[@name='12Q']")
    private WebElement siblingAattayno;

    //sibling first name
    @FindBy(xpath = "(//input[@placeholder='Sibling First Name']")
    private WebElement sibligfirstname;

    // radio button brother or sister
    @FindBy(xpath = "//input[@name='12R']")
    private WebElement brotherorsisyes;

    @FindBy(xpath = "//input[@name='12S']")
    private WebElement brotherorsisno;

    //bother sister name
    //ponnam=((//div[@class='col-md-4 col-sm-4 ng-scope']//input[@placeholder='Name'])[1])

    @FindBy(xpath = "//div[@class='col-md-4 col-sm-4 ng-scope']//input[@placeholder='Name'])[1])" )
    private WebElement brosisnamre;
    // brotheror sister age
    @FindBy(xpath = "(//div[@class='col-md-6 col-sm-6']//div[1]//fieldset[1]//div[4]//div[2]//input[1])]")
    private WebElement brosisage;

    //gender

    @FindBy(xpath = "//div[@class='item'][contains(text(),'Female')]")
    private WebElement genderfemale;

    @FindBy(xpath = "//div[@class='item'][contains(text(),'Male')]")
    private WebElement gendermale;

    @FindBy(xpath = "/div[@class='col-md-6 col-sm-6']//div[1]//fieldset[1]//div[4]//div[2]//input[1]")
    private WebElement brothersisgend;


    //Relationship
    ////div[@class='col-md-6 col-sm-6']//div[1]//fieldset[1]//div[9]//div[1]//input[1]
    @FindBy(xpath = "//div[@class='col-md-6 col-sm-6']//div[1]//fieldset[1]//div[9]//div[1]//input[1]")
    private WebElement relationship;

    //Occupation
    ////div[9]//div[2]//input[1]
    @FindBy(xpath = "//div[9]//div[2]//input[1]")
    private WebElement occupation;

    //name

    //age
    @FindBy(xpath = "//div[@class='col-md-6 col-sm-6']//div[1]//fieldset[1]//div[8]//div[2]//input[1]")
    private WebElement addage;
    //Gander
    private WebElement sgender;
    //div[8]//div[3]//div[1]//div[1]//input[1]

    //Relationship

    @FindBy(xpath = "//div[@class='col-md-6 col-sm-6']//div[1]//fieldset[1]//div[5]//div[1]//input[1]")
    private WebElement Relationship;
    //Occupation
    //poonam
    @FindBy(xpath="//div[@class='col-md-4 col-sm-4']//input[@placeholder='Occupation'])[3]")
    private WebElement Occupation;

    //Are you travelling with family members?    Yes   No
    private WebElement travelyesno;
    @FindBy(xpath = "")
    // How many family members are you travelling with?
    private WebElement howmanyfamiy;
    //Select Members
    private WebElement selectmember;
    // Car owner
    private WebElement carowner;

    //Describe personality
   // Outgoing      Independent      Like to be active      Do not worry to much
   // Organized      Shy      Like to study      Quiet
   // Like to talk      Disorganized      Easily worried
    //Friendly      Socializing with friends is important to me
    //What Hobbies / Activities do you enjoy ? If the text type



    @FindBy(xpath = "div[@class='col-md-3 col-sm-3']//input[@type='checkbox'and @ng-true-value='Outgoing']")
    private WebElement outgoing;
    @FindBy(xpath = "div[@class='col-md-3 col-sm-3']//input[@type='checkbox' and @ng-true-value='Independent']")
    private WebElement Independent;
    @FindBy(xpath = "div[@class='col-md-3 col-sm-3']//input[@type='checkbox' and @ng-true-value='Like to be active']")
    private WebElement be_active;
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-3']//input[@type='checkbox' and @ng-true-value='Do not worry to much']")
    private WebElement not_worry;
    @FindBy(xpath = "div[@class='col-md-3 col-sm-3']//input[@type='checkbox' and @ng-true-value='Organized']")
     private WebElement Organized;
    @FindBy(xpath ="div[@class='col-md-3 col-sm-3']//input[@type='checkbox' and @ng-true-value='shy']")
    private WebElement Shy;
    @FindBy(xpath ="//div[@class='col-md-3 col-sm-3']//input[@type='checkbox' and @ng-true-value='Like to study']")
    private WebElement Liketostudy;
    @FindBy(xpath ="//div[@class='col-md-3 col-sm-3']//input[@type='checkbox' and @ng-true-value='Quiet']")
    private WebElement Quiet;
    @FindBy(xpath ="//div[@class='col-md-3 col-sm-3']//input[@type='checkbox' and @ng-true-value='Like to talk']")
    private WebElement Liketotalk;
    @FindBy(xpath ="//div[@class='col-md-3 col-sm-3']//input[@type='checkbox' and @ng-true-value='Disorganized']")
    private WebElement Disorganized;
    @FindBy(xpath ="//div[@class='col-md-3 col-sm-3']//input[@type='checkbox' and @ng-true-value='Easily worried']")
    private WebElement Easilyworried;
    @FindBy(xpath ="//div[@class='col-md-3 col-sm-3']//input[@type='checkbox' and @ng-true-value='Friendly']")
    private WebElement Friendly;
    @FindBy(xpath ="//div[@class='col-md-3 col-sm-3']//input[@type='checkbox'and @ng-true-value='socializing with friends is important to me']")
    private WebElement Socializing;


    //What Hobbies / Activities do you enjoy ?
    @FindBy(xpath="//textarea[@placeholder='Hobbies']")
    private WebElement Hobbies;

    //Do you travel by bus/train
    @FindBy(xpath="//input[@name='0X2']")
    private WebElement bustrainyes;
    //yes
    @FindBy(xpath ="//input[@name='0X3']")
    private WebElement bustrainno;
    //no
    //  please explain

    @FindBy(xpath = "//textarea[@placeholder='Travel With'] ")
    private WebElement travelwith;
    //On average how much time do you spend traveling to school?
    @FindBy(xpath = "//input[@placeholder='Time spend traveling to school']")
    private WebElement timespend;
    //What Sports do you play?
    @FindBy(xpath = "//textarea[@placeholder='Sports']")
    private WebElement sports;

    //What Musical Instruments do you play
    @FindBy(xpath = " //textarea[@placeholder='Musical instruments']")
    private WebElement instruments;

    //What are your favorite subjects
    @FindBy(xpath = "//textarea[@placeholder='Favorite subjects']")
    private WebElement fevsub;

    //Least favourite subject:
    @FindBy(xpath = "//textarea[@placeholder='Least favourite subjects']")
    private WebElement leastsub;

    //What will you be doing in the 2 months
    @FindBy(xpath ="//textarea[@placeholder='International program']")
    private WebElement International;

    //Is your family Christian? radio button
    //Yes
    @FindBy(xpath = "input[@name='0X4']")
    private WebElement famychriyes;
    //no
   @FindBy(xpath="input[@name='0X5']")
   private WebElement famychrino;

    //Eye Colours
    @FindBy(xpath = "//input[@placeholder='Eye Colours']")
    private WebElement eyecolor;

    //Hair Colour
    @FindBy(xpath = "//input[@placeholder='Hair Colour']")
    private WebElement hairclor;

    //Personal Health Number
    @FindBy(xpath = "//input[@placeholder='Personal Health Number']")
    private WebElement personalhelnum;

    //Date of information
    @FindBy(xpath = "/strong[contains(text(),'December 2019')]")
    private WebElement datepick;


    //Distinguishing marks
    @FindBy(xpath = "//input[@placeholder='Distinguishing marks']")
    private WebElement dismark;


    //Other countries I have visited
    @FindBy(xpath="//input[@placeholder='Other countries I have visited']")
    private WebElement othercounty;

    //Proficiency in English:
    //Speaking
    @FindBy(xpath = "//input[@placeholder='Speaking']")
    private WebElement speaking;

    // Listening

    @FindBy(xpath="//input[@placeholder='Listening']")
    private WebElement Listening;

    //Reading
    @FindBy(xpath ="//input[@placeholder='Reading']")
    private WebElement Reading;

    //Writing
    private WebElement Writing;
    @FindBy(xpath ="//input[@placeholder='Writing']")
    private WebElement writting;

    //Do you intend to continue your education RADIO BUTTON
    //yes
    @FindBy(xpath ="//input[@name='1FH'])")
    private WebElement eduradioyes;

    // //input[@name='1FI'] NO
    private WebElement eduradiono;

    // What major areas of study do you plan to pursue?
    @FindBy(xpath="//textarea[@placeholder='Areas Of Study']")
    private WebElement Areaofstudy;

    //What are your career goals?
    @FindBy(xpath="//textarea[@placeholder='Career Goals']")
    private WebElement careergoal;

    //Please choose in order of preference
    @FindBy(xpath="//input[@placeholder='Art']")
    private WebElement art;
    @FindBy(xpath="//input[@placeholder='Dance']")
    private WebElement Dance;
    @FindBy(xpath="//input[@placeholder='Drama']")
    private WebElement Drama;
    @FindBy(xpath="//input[@placeholder='Music']")
    private WebElement Music;

    //I would prefer: radio
    @FindBy(xpath="//input[@name='1FJ'])")
    private WebElement radioscience;
    @FindBy(xpath ="//input[@name='1FK']}")
    private WebElement radiogeneral;

    //Extra-curricular activities
    @FindBy(xpath = "//textarea[@placeholder='Extra Curricular Activities']")
    private WebElement extracurr;

    //If you cannot participate in physical education classes, please expla
    @FindBy(xpath = "//textarea[@placeholder='Cannot participate in physical education classes']")
    private WebElement physical;

    //If your home country requires
    @FindBy(xpath = "//textarea[@placeholder='Validated Courses']")
    private WebElement validcourse;


    public AIpersonalInformation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

 //   public AIpersonalInformation entersibling(String siblingAattayesv) {
   //     this.siblingAattayes.sendKeys();
     //   return this;
    //}

    public AIpersonalInformation entersiblinggen(String sibligfname) {
        this.sibligfirstname.sendKeys();
        return this;
    }


    public AIpersonalInformation entersiblingAattayes(String siblingAattayesv) {
        this.siblingAattayes.sendKeys();
        return this;
    }
    public AIpersonalInformation entersiblingAattayno(String siblingAattaynov) {
        this.siblingAattayno.sendKeys();
        return this;
    }
    public AIpersonalInformation entersibligfirstname(String sibligfirstnamev) {
        this.sibligfirstname.sendKeys();
        return this;
    }
    public AIpersonalInformation enterbrotherorsisyes(String brotherorsisyesv) {
        this.brotherorsisyes.sendKeys();
        return this;
    }
    public AIpersonalInformation enterbrotherorsisno(String brotherorsisnov) {
        this.brotherorsisno.sendKeys();
        return this;
    }
    public AIpersonalInformation enterbrosisnamre(String brosisnamrev) {
        this.brosisnamre.sendKeys();
        return this;
    }
    public AIpersonalInformation enterbrosisage(String brosisagev) {
        this.brosisage.sendKeys();
        return this;
    }
    public AIpersonalInformation entergenderfemale(String genderfemalev) {
        this.genderfemale.sendKeys();
        return this;
    }
    public AIpersonalInformation entergendermale(String gendermalev) {
        this.gendermale.sendKeys();
        return this;
    }
    public AIpersonalInformation enterbrothersisgend(String brothersisgendv) {
        this.brothersisgend.sendKeys();
        return this;
    }
    public AIpersonalInformation enterrelationship(String relationshipv) {
        this.relationship.sendKeys();
        return this;
    }
    public AIpersonalInformation enteroccupation(String occupationv) {
        this.occupation.sendKeys();
        return this;
    }
    public AIpersonalInformation enteraddage(String addagev) {
        this.addage.sendKeys();
        return this;
    }
    public AIpersonalInformation entersgender(String sgenderv) {
        this.sgender.sendKeys();
        return this;
    }
    public AIpersonalInformation enterRelationship(String Relationshipv) {
        this.Relationship.sendKeys();
        return this;
    }
    public AIpersonalInformation enterOccupation(String Occupationv) {
        this.Occupation.sendKeys();
        return this;
    }
    public AIpersonalInformation entertravelyesno(String travelyesnov) {
        this.travelyesno.sendKeys();
        return this;
    }
    public AIpersonalInformation enterselectmember(String selectmemberv) {
        this.selectmember.sendKeys();
        return this;
    }
    public AIpersonalInformation enterhowmanyfamiy(String howmanyfamiyv) {
        this.howmanyfamiy.sendKeys();
        return this;
    }
    public AIpersonalInformation entercarowner(String carownerv) {
        this.carowner.sendKeys();
        return this;
    }
    public AIpersonalInformation enteroutgoing(String outgoingv) {
        this.outgoing.sendKeys();
        return this;
    }
    public AIpersonalInformation enterIndependent(String Independentv) {
        this.Independent.sendKeys();
        return this;
    }
    public AIpersonalInformation enterbe_active(String be_activev) {
        this.be_active.sendKeys();
        return this;
    }
    public AIpersonalInformation enternot_worry(String not_worryv) {
        this.not_worry.sendKeys();
        return this;
    }
    public AIpersonalInformation enterprivate Organized(String private Organizedv) {
        this.private Organized.sendKeys();
        return this;
    }
    public AIpersonalInformation enterShy(String Shyv) {
        this.Shy.sendKeys();
        return this;
    }
    public AIpersonalInformation enterLiketostudy(String Liketostudyv) {
        this.Liketostudy.sendKeys();
        return this;
    }
    public AIpersonalInformation enterQuiet(String Quietv) {
        this.Quiet.sendKeys();
        return this;
    }
    public AIpersonalInformation enterLiketotalk(String Liketotalkv) {
        this.Liketotalk.sendKeys();
        return this;
    }
    public AIpersonalInformation enterDisorganized(String Disorganizedv) {
        this.Disorganized.sendKeys();
        return this;
    }
    public AIpersonalInformation enterEasilyworried(String Easilyworriedv) {
        this.Easilyworried.sendKeys();
        return this;
    }
    public AIpersonalInformation enterFriendly(String Friendlyv) {
        this.Friendly.sendKeys();
        return this;
    }
    public AIpersonalInformation enterSocializing(String Socializingv) {
        this.Socializing.sendKeys();
        return this;
    }
    public AIpersonalInformation enterHobbies(String Hobbiesv) {
        this.Hobbies.sendKeys();
        return this;
    }
    public AIpersonalInformation enterbustrainyes(String bustrainyesv) {
        this.bustrainyes.sendKeys();
        return this;
    }
    public AIpersonalInformation enterbustrainno(String bustrainnov) {
        this.bustrainno.sendKeys();
        return this;
    }
    public AIpersonalInformation entertravelwith(String travelwithv) {
        this.travelwith.sendKeys();
        return this;
    }
    public AIpersonalInformation entertimespend(String timespendv) {
        this.timespend.sendKeys();
        return this;
    }
    public AIpersonalInformation entersports(String sportsv) {
        this.sports.sendKeys();
        return this;
    }
    public AIpersonalInformation enterinstruments(String instrumentsv) {
        this.instruments.sendKeys();
        return this;
    }
    public AIpersonalInformation enterfevsub(String fevsubv) {
        this.fevsub.sendKeys();
        return this;
    }
    public AIpersonalInformation enterleastsub(String leastsubv) {
        this.leastsub.sendKeys();
        return this;
    }
    public AIpersonalInformation enterInternational(String Internationalv) {
        this.International.sendKeys();
        return this;
    }
    public AIpersonalInformation enterfamychriyes(String famychriyesv) {
        this.famychriyes.sendKeys();
        return this;
    }
    public AIpersonalInformation enterfamychrino(String famychrinov) {
        this.famychrino.sendKeys();
        return this;
    }
    public AIpersonalInformation entereyecolor(String eyecolorv) {
        this.eyecolor.sendKeys();
        return this;
    }
    public AIpersonalInformation enterhairclor(String hairclorv) {
        this.hairclor.sendKeys();
        return this;
    }
    public AIpersonalInformation enterpersonalhelnum(String personalhelnumv) {
        this.personalhelnum.sendKeys();
        return this;
    }git
    public AIpersonalInformation enterdatepick(String datepickv) {
        this.datepick.sendKeys();
        return this;
    }
    public AIpersonalInformation enterdismark(String dismarkv) {
        this.dismark.sendKeys();
        return this;
    }
    public AIpersonalInformation enterothercounty(String othercountyv) {
        this.othercounty.sendKeys();
        return this;
    }
    public AIpersonalInformation enterspeaking(String speakingv) {
        this.speaking.sendKeys();
        return this;
    }
    public AIpersonalInformation enterListening(String Listeningv) {
        this.Listening.sendKeys();
        return this;
    }
    public AIpersonalInformation enterReading(String Readingv) {
        this.Reading.sendKeys();
        return this;
    }
    public AIpersonalInformation enterwritting(String writtingv) {
        this.writting.sendKeys();
        return this;
    }
    public AIpersonalInformation entereduradioyes(String eduradioyesv) {
        this.eduradioyes.sendKeys();
        return this;
    }
    public AIpersonalInformation entereduradiono(String eduradionov) {
        this.eduradiono.sendKeys();
        return this;
    }
    public AIpersonalInformation enterAreaofstudy(String Areaofstudyv) {
        this.Areaofstudy.sendKeys();
        return this;
    }
    public AIpersonalInformation entercareergoal(String careergoalv) {
        this.careergoal.sendKeys();
        return this;
    }
    public AIpersonalInformation enterart(String artv) {
        this.art.sendKeys();
        return this;
    }
    public AIpersonalInformation enterDance(String Dancev) {
        this.Dance.sendKeys();
        return this;
    }
    public AIpersonalInformation enterDrama(String Dramav) {
        this.Drama.sendKeys();
        return this;
    }
    public AIpersonalInformation enterMusic(String Musicv) {
        this.Music.sendKeys();
        return this;
    }
    public AIpersonalInformation enterradioscience(String radiosciencev) {
        this.radioscience.sendKeys();
        return this;
    }
    public AIpersonalInformation enterradiogeneral(String radiogeneralv) {
        this.radiogeneral.sendKeys();
        return this;
    }
    public AIpersonalInformation enterextracurr(String extracurrv) {
        this.extracurr.sendKeys();
        return this;
    }
    public AIpersonalInformation enterphysical(String physicalv) {
        this.physical.sendKeys();
        return this;
    }
    public AIpersonalInformation entervalidcourse(String validcoursev) {
        this.validcourse.sendKeys();
        return this;
    }



}