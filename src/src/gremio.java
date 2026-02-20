public class gremio{
    private Object[] members = new Object[3];
    private int currentMembers = 0;

    public void setMember(pGuerrero member){
        if (currentMembers > 3){
            System.out.println("Gremio lleno!");
        }
        else {
            members[currentMembers] = member;
            currentMembers++;
        }
    }
    public void setMember(pArquero member){
        if (currentMembers > 3){
            System.out.println("Gremio lleno!");
        }
        else {
            members[currentMembers] = member;
            currentMembers++;
        }
    }
    public void setMember(pMago member){
        if (currentMembers > 3){
            System.out.println("Gremio lleno!");
        }
        else {
            members[currentMembers] = member;
            currentMembers++;
        }
    }
}