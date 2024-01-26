import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ResultMenu {

	//création de listes

private List <String> collect;

//on veut collecter les réponses
public void CollectResponse() {
	this.collect= new ArrayList<>();
	
}
//on veut ajouter les résultats des réponses
public synchronized void addResponses(String response) {
	collect.add(response);
}

//on veut obetenir les réponses dans une liste

public synchronized  List <String> getResponses(){
	return new ArrayList <>(collect);
}
}

//récupérr les réponses en thread
//faire une sorte de liste de ces choix
//les recopier dans le fichier