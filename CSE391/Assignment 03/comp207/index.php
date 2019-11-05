 <?php

include 'connection.php';

if(isset($_POST['done'])){
    $fname = $_POST['inputFname'];
    $lname = $_POST['inputLname'];
    $sid = $_POST['inputSID'];
    $email = $_POST['inputEmail'];
    $slot = $_POST['inputSlot'];
 
 
 $query1 = "INSERT INTO `user`(`fname`,`lname`,`SID`,`email`,`slot`) VALUES ('$fname','$lname', '$sid', '$email', '$slot')";
 $query = mysqli_query($connection,$query1);
 $q = "UPDATE `slots` SET `seats`= (seats - 1) WHERE `slot`= '$slot' ";
 $query1 = mysqli_query($connection,$q);
}
?>

<!DOCTYPE HTML>  
<html>
<head>
    <link href='https://fonts.googleapis.com/css?family=Barriecito' rel='stylesheet'>
    <link href='https://fonts.googleapis.com/css?family=Frijole' rel='stylesheet'>
</head>
<style>
    input[type=text], select {
          width: 100%;
          padding: 12px 20px;
          margin: 8px 0;
          display: inline-block;
          border: 1px solid #ccc;
          border-radius: 4px;
          box-sizing: border-box;
    }

    input[type=submit] {
          width: 100%;
          background-color: #4CAF50;
          color: white;
          padding: 14px 20px;
          margin: 8px 0;
          border: none;
          border-radius: 4px;
          cursor: pointer;
    }

    input[type=submit]:hover {
          background-color: #45a049;
    }

    input[type=reset] {
          width: 100%;
          background-color: red;
          color: white;
          padding: 14px 20px;
          margin: 8px 0;
          border: none;
          border-radius: 4px;
          cursor: pointer;
    }

    input[type=reset]:hover {
          background-color: darkred;
    }

    div {
          border-radius: 5px;
          background-color: #f2f2f2;
          padding: 8px;
    }
    .button {
          background-color: red;
          border: none;
          color: white;
          padding: 15px 32px;
          text-align: center;
          text-decoration: none;
          display: inline-block;
          font-size: 16px;
          margin: 4px 2px;
          cursor: pointer;
          width : 100%;
    }
    h1 {
          text-align: center;
          font-family: 'Frijole';
    }

    .topbar {
          overflow: hidden;
          background-color: #252525;
          font-family: 'Barriecito';
          font-size: 22px;
    }

    .topbar a {
          float: left;
          display: block;
          color: #f2f2f2;
          text-align: center;
          padding: 14px 16px;
          text-decoration: none;
          border: none;
    }

    .topbar a:hover {
          background-color: #ddd;
          color: black;
    }
</style>
<body> 
<div class="topbar">
        <a href="index.php">Home</a>
        <a href="studentlist.php">Student List</a>
</div>
<h1>BOOK YOUR SLOT</h1>
<form method="post">
                                        
                                        
                                        <div>
                                            <input name="inputFname" type="text" placeholder="First Name">
                                        </div>
                                        <div>
                                            <input name="inputLname" type="text"  placeholder="Last Name">
                                        </div>
                                        <div>
                                            <input name="inputSID" type="text"  placeholder="Student ID">
                                        </div>
                                        <div>
                                            <input name="inputEmail" type="text"  placeholder="Email">
                                        </div>
                                        <div>
                                        <input list="inputSlot" type="text" name="inputSlot">
                                          <datalist id="inputSlot">
                                          <option value="1">
                                          <option value="2">
                                          <option value="3">
                                          <option value="4">
                                          </datalist>
                                        </div>
                                        <input type="submit" name="done" value = "Register">
                                        <input type="reset" name="cancel" value = "Clear">

        </form>
</body>
</html>