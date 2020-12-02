<?php
$conn = mysqli_connect('localhost','shopaze','','shopaze');
$query = "SELECT * FROM LOGIN";
$result = mysqli_query($conn,$query);
while($row = mysqli_fetch_array($result)){
    echo "".$row["username"]."<br>";
}
?>