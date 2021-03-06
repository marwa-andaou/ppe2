package controleur;


public class Article 
{
   private String nom, designation, code_article;
   private float prix_unitaire;
   private int id, id_famille, id_sous_famille, quantite;
   
   public Article ()
   {	
	   this.id = 0;
       this.id_famille = 0;
       this.id_sous_famille = 0;
       this.nom = this.designation = this.code_article="";
       this.prix_unitaire = 0;
       this.quantite = 0;
   }
   
   public Article (int id, int id_famille, int id_sous_famille, String nom, String code_article, String designation, float prix_unitaire, int quantite)
   {
	   this.id = id;
       this.id_famille = id_famille;
       this.id_sous_famille = id_sous_famille;
	   this.nom = nom;
       this.code_article= code_article;
       this.designation = designation;
       this.prix_unitaire = prix_unitaire;
       this.quantite = quantite;
   }
   
   
   public String toString()
   {
       return this.nom+" - "+this.designation+" - "+this.id+" - "+this.id_famille+" - "+this.id_sous_famille+" - "+this.prix_unitaire+" - "+this.quantite+" - "+this.code_article;
   }

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getCode_article() {
		return code_article;
	}
	
	public void setCode_article(String code_article) {
		this.code_article = code_article;
	}
	
	public float getPrix_unitaire() {
		return prix_unitaire;
	}
	
	public void setPrix_unitaire(float prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId_famille() {
		return id_famille;
	}
	
	public void setId_famille(int id_famille) {
		this.id_famille = id_famille;
	}
	
	public int getId_sous_famille() {
		return id_sous_famille;
	}
	
	public void setId_sous_famille(int id_sous_famille) {
		this.id_sous_famille = id_sous_famille;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


   
}
