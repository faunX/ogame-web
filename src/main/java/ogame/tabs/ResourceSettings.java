package ogame.tabs;

import ogame.FinalXPath;
import ogame.utils.log.AppLog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResourceSettings {

    private static final String BUTTON = "//*[@id=\"menuTable\"]/li[2]/span/a/div";
    private static final String METAL_PER_HOUR = "//*[@id=\"inhalt\"]/div[2]/div[2]/form/table/tbody/tr[20]/td[2]/span";
    private static final String METAL_PER_DAY = "//*[@id=\"inhalt\"]/div[2]/div[2]/form/table/tbody/tr[21]/td[2]/span";
    private static final String METAL_PER_WEEK = "//*[@id=\"inhalt\"]/div[2]/div[2]/form/table/tbody/tr[22]/td[2]/span";
    private static final String CRYSTAL_PER_HOUR = "//*[@id=\"inhalt\"]/div[2]/div[2]/form/table/tbody/tr[20]/td[3]/span";
    private static final String CRYSTAL_PER_DAY = "//*[@id=\"inhalt\"]/div[2]/div[2]/form/table/tbody/tr[21]/td[3]/span";
    private static final String CRYSTAL_PER_WEEK = "//*[@id=\"inhalt\"]/div[2]/div[2]/form/table/tbody/tr[22]/td[3]/span";
    private static final String DEUTERIUM_PER_HOUR = "//*[@id=\"inhalt\"]/div[2]/div[2]/form/table/tbody/tr[20]/td[4]/span";
    private static final String DEUTERIUM_PER_DAY = "//*[@id=\"inhalt\"]/div[2]/div[2]/form/table/tbody/tr[21]/td[4]/span";
    private static final String DEUTERIUM_PER_WEEK = "//*[@id=\"inhalt\"]/div[2]/div[2]/form/table/tbody/tr[22]/td[4]/span";

    public static boolean click(WebDriver w){
        try{
            if(visible(w)){ return true;
            }
            WebElement e =  w.findElement(By.xpath(BUTTON));
            e.click();
            return true;
        }
        catch (Exception e){
            AppLog.printOnConsole(ResourceSettings.class.getName(),1,"While trying to click on a tab.");
        }
        return false;
    }

    public static boolean visible (WebDriver w){
        try{
            WebElement e =  w.findElement(By.xpath(FinalXPath.BODY));
            String s = e.getAttribute("id");
            return s.contains("resourceSettings");
        }
        catch (Exception e){
            AppLog.printOnConsole(ResourceSettings.class.getName(),1,"When it checks, the resource settings is visible.");
        }
        return false;
    }

    public static int metalPerHour(WebDriver w){
        if(visible(w)){
            try{
                WebElement e =  w.findElement(By.xpath(METAL_PER_HOUR));
                String s = e.getText();
                s = removeDot(s);
                return value(s);
            }
            catch (Exception e){
                AppLog.printOnConsole(ResourceSettings.class.getName(),1,"While try download metal per hour.");
            }
        }
        return -1;
    }

    public static int metalPerDay(WebDriver w){
        if(visible(w)){
            try{
                WebElement e =  w.findElement(By.xpath(METAL_PER_DAY));
                String s = e.getText();
                s = removeDot(s);
                return value(s);
            }
            catch (Exception e){
                AppLog.printOnConsole(ResourceSettings.class.getName(),1,"While try download metal per day.");
            }
        }
        return -1;
    }

    public static int metalPerWeek(WebDriver w){
        if(visible(w)){
            try{
                WebElement e =  w.findElement(By.xpath(METAL_PER_WEEK));
                String s = e.getText();
                s = removeDot(s);
                return value(s);
            }
            catch (Exception e){
                AppLog.printOnConsole(ResourceSettings.class.getName(),1,"While try download metal per week.");
            }
        }
        return -1;
    }

    public static int crystalPerHour(WebDriver w){
        if(visible(w)){
            try{
                WebElement e =  w.findElement(By.xpath(CRYSTAL_PER_HOUR));
                String s = e.getText();
                s = removeDot(s);
                return value(s);
            }
            catch (Exception e){
                AppLog.printOnConsole(ResourceSettings.class.getName(),1,"While try download crystal per hour.");
            }
        }
        return -1;
    }

    public static int crystalPerDay(WebDriver w){
        if(visible(w)){
            try{
                WebElement e =  w.findElement(By.xpath(CRYSTAL_PER_DAY));
                String s = e.getText();
                s = removeDot(s);
                return value(s);
            }
            catch (Exception e){
                AppLog.printOnConsole(ResourceSettings.class.getName(),1,"While try download crystal per day.");
            }
        }
        return -1;
    }

    public static int crystalPerWeek(WebDriver w){
        if(visible(w)){
            try{
                WebElement e =  w.findElement(By.xpath(CRYSTAL_PER_WEEK));
                String s = e.getText();
                s = removeDot(s);
                return value(s);
            }
            catch (Exception e){
                AppLog.printOnConsole(ResourceSettings.class.getName(),1,"While try download crystal per week.");
            }
        }
        return -1;
    }

    public static int deuteriumPerHour(WebDriver w){
        if(visible(w)){
            try{
                WebElement e =  w.findElement(By.xpath(DEUTERIUM_PER_HOUR));
                String s = e.getText();
                s = removeDot(s);
                return value(s);
            }
            catch (Exception e){
                AppLog.printOnConsole(ResourceSettings.class.getName(),1,"While try download deuterium per hour.");
            }
        }
        return -1;
    }

    public static int deuteriumPerDay(WebDriver w){
        if(visible(w)){
            try{
                WebElement e =  w.findElement(By.xpath(DEUTERIUM_PER_DAY));
                String s = e.getText();
                s = removeDot(s);
                return value(s);
            }
            catch (Exception e){
                AppLog.printOnConsole(ResourceSettings.class.getName(),1,"While try download deuterium per day.");
            }
        }
        return -1;
    }

    public static int deuteriumPerWeek(WebDriver w){
        if(visible(w)){
            try{
                WebElement e =  w.findElement(By.xpath(DEUTERIUM_PER_WEEK));
                String s = e.getText();
                s = removeDot(s);
                return value(s);
            }
            catch (Exception e){
                AppLog.printOnConsole(ResourceSettings.class.getName(),1,"While try download deuterium per week.");
            }
        }
        return -1;
    }
    /**
     * Usuwa z tekstu ',' lub '.'.
     * @param s Ilość surowca pobrana z strony.
     * @return Tekst bez ',' lub '.'.
     */
    private static String removeDot(String s) {
        if(s.contains("m"))
            return s.replace(",","");
        else if(s.contains("Mld"))
            return s.replace(",","");
        else
            return s.replace(".","");
    }

    /**
     * Ilość surowców bez '.' lub ','.
     * @param s Ilość surowca pobrana z strony.
     * @return Ilość surowca.
     */
    private static int value(String s) {
        if(s.contains("m"))
            return Integer.parseInt(s.replace("m","")) * 1000 ;
        else if(s.contains("Mld"))
            return Integer.parseInt(s.replace("Mld","")) * 1000000;
        else
            return Integer.parseInt(s);
    }
}
