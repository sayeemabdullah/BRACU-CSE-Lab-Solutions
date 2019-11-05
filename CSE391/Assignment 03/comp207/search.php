<?php include 'connection.php'; ?>

<!DOCTYPE html>
<html lang="en">
<head>
</head>
</head>
<style>
            table {
                border-collapse: collapse;
                width: 100%;
                }

            th, td {
                text-align: left;
                padding: 8px;
                }

            tr:nth-child(even) {background-color: #f2f2f2;}
            
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

            

            h1 {
                text-align: center;
                font-family: 'Frijole';
            }
</style>
<body>

 <div class="container">
        <div class="row">
        </div> 
            <br>
                <h3 class="text-primary text-center"> Search Result for : <?php $d = $_GET['searchFor'];echo $d?> </h3>
                <br>
                <table>

<tr>

                        <th> First Name </th>
                        <th> Last Name </th>
                        <th> Student ID </th>
                        <th> Email </th>
                        <th> Slot</th>
</tr>


<?php
$dd = $_GET['searchFor'];
$q3 = "SELECT * FROM user where SID like'%$dd%' ";
$show3 = mysqli_query($connection,$q3);
while($res = mysqli_fetch_array($show3)){
    ?>
    <tr>
        
        <td>
            <?php echo $res['fname'];  ?>
        </td>
        <td>
            <?php echo $res['lname'];  ?>
        </td>
        <td>
            <?php echo $res['SID'];  ?>
        </td>
        <td>
            <?php echo $res['email'];  ?>
        </td>
        <td>
            <?php echo $res['slot'];  ?>
        </td>

    </tr>
    <?php 
    }
    ?>
</table>
</div>
</div>




<script type="text/javascript">
$(document).ready(function () {
$('#tabledata').DataTable();
})
</script>


</body>
</html>