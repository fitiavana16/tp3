<?php
function calculPuissance($nombre, $puissance) {
    $resultat = 1;
    for ($i = 0; $i < $puissance; $i++) {
        $resultat *= $nombre;
    }
    return $resultat;
}

// Exemple d'utilisation de la fonction
$nombre = 3;
$puissance = 2;
$resultat = calculPuissance($nombre, $puissance);
echo "Le résultat de $nombre^$puissance est : $resultat";
?>
