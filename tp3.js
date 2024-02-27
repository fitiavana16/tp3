function calculPuissance(nombre, puissance) {
    let resultat = 1;
    for (let i = 0; i < puissance; i++) {
        resultat *= nombre;
    }
    return resultat;
}

const nombre = parseFloat(prompt("Entrez un nombre : "));
const puissance = parseInt(prompt("Entrez la puissance : "));

const resultat = calculPuissance(nombre, puissance);
console.log("Le résultat de " + nombre + "^" + puissance + " est : " + resultat);
