public class Email {
    private String subject;
    private String to;
    private String from;
    private String body;

    public Email(String subject, String to, String from, String body){
        this.subject = subject;
        this.to = to;
        this.from = from;
        this.body = body;
    }

    public Email(String subject, String to, String from){
        this.subject = subject;
        this.to = to;
        this.from = from;
        this.body = "";
    }

    public void setBody(String body){
        this.body = body;
    }

    public void addToBody(String text){
        this.body += text;
    }

    public boolean equals(Email other){
        boolean isSame = false;
        if(this.subject.equals(other.subject) && this.to.equals(other.to) && this.from.equals(other.from) && this.body.equals(other.body)){
            isSame = true;
        }
        return isSame;
    }

    public String getSubject(){
        return this.subject;
    }

    public String getTo(){
        return this.to;
    }

    public String getFrom(){
        return this.from;
    }

    public String getBody(){
        return this.body;
    }

    public String toString(){
        return String.format("From: %s; To: %s; Subject: %s; Body: %s", this.from, this.to, this.subject, this.body);
    }
}
