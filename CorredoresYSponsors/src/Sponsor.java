import java.util.HashSet;

public class Sponsor {
    HashSet<EsSponsoreable> sponsoreables = new HashSet<>();


    public void agregarSponsoreables(EsSponsoreable sponsoreable){
        if(sponsoreable.esSponsoreable()){
            sponsoreables.add(sponsoreable);
        }
    }
}
