<?php
$conn = mysqli_connect('localhost','shopaze','','shopaze');
if(!$conn){
    echo "Not connected to server!!";
}
if(!mysqli_select_db($conn,'shopaze')){
    echo "Database not selected";
}

    $fname = $_POST['fname'];
    $lname = $_POST['lname'];
    $username = $_POST['username'];
    $city = $_POST['city'];
    $state = $_POST['state'];
    $password = $_POST['password'];
    $gender = $_POST['gender'];
    
    $query = "INSERT INTO signin(first_name,last_name,username,city,state,password,gender) VALUES('$fname','$lname','$username','$city','$state','$password','$gender')";

    if(!mysqli_query($conn,$query)){
        echo "Not Inserted";
    }
    else{
        echo "Inserted";
    }



?>