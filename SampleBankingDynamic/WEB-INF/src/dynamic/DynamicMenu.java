package dynamic;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entry"
})
@XmlRootElement(name = "dynamicmenu")
public class DynamicMenu {

    @XmlElement(name = "Entry")
    protected List<Entry> entry;

    public List<Entry> getEntry() {
        if (entry == null) {
            entry = new ArrayList<>();
        }
        return this.entry;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Entry {

        @XmlElement(name = "key", required = true)
        protected String key;
        @XmlElement(name = "value", required = true)
        protected Value value;

        public String getKey() {
            return key;
        }

        public void setKey(String value) {
            this.key = value;
        }

        public Value getValue() {
            return value;
        }

        public void setValue(Value value) {
            this.value = value;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Value {

        @XmlElement(name = "prompts")
        protected Prompts prompts;
        @XmlElement(name = "grammars")
        protected String grammars;
        @XmlElement(name = "nextnode")
        protected String nextNode;
        @XmlElement(name = "menuId")
        protected String menuId;
        @XmlElement(name = "menuDescription")
        protected String menuDescription;
        @XmlElement(name = "noInput")
        protected String noInput;
        @XmlElement(name = "noMatch")
        protected String noMatch;
        @XmlElement(name = "maxTries")
        protected String maxTries;
        @XmlElement(name = "retry")
        protected String retry;

        public Prompts getPrompts() {
            return prompts;
        }

        public void setPrompts(Prompts prompts) {
            this.prompts = prompts;
        }

        public String getGrammars() {
            return grammars;
        }

        public void setGrammars(String grammars) {
            this.grammars = grammars;
        }

        public String getNextNode() {
            return nextNode;
        }

        public void setNextNode(String nextNode) {
            this.nextNode = nextNode;
        }

        public String getMenuId() {
            return menuId;
        }

        public void setMenuId(String menuId) {
            this.menuId = menuId;
        }

        public String getMenuDescription() {
            return menuDescription;
        }

        public void setMenuDescription(String menuDescription) {
            this.menuDescription = menuDescription;
        }

        public String getNoInput() {
            return noInput;
        }

        public void setNoInput(String noInput) {
            this.noInput = noInput;
        }

        public String getNoMatch() {
            return noMatch;
        }

        public void setNoMatch(String noMatch) {
            this.noMatch = noMatch;
        }

        public String getMaxTries() {
            return maxTries;
        }

        public void setMaxTries(String maxTries) {
            this.maxTries = maxTries;
        }

        public String getRetry() {
            return retry;
        }

        public void setRetry(String retry) {
            this.retry = retry;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Prompts {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "bargein")
        protected String bargein;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getBargein() {
            return bargein;
        }

        public void setBargein(String value) {
            this.bargein = value;
        }
    }
}
