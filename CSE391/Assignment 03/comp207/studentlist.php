<?php
include 'connection.php';
?>
<!DOCTYPE HTML> 
<html>
<head>
<link href='https://fonts.googleapis.com/css?family=Barriecito' rel='stylesheet'>
<link href='https://fonts.googleapis.com/css?family=Frijole' rel='stylesheet'>
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
<div class="topbar">
        <a href="index.php">Home</a>
        <a href="studentlist.php">Student List</a>
</div>
<br><br>
<form method="get" action="search.php">
                <div>
                    <input type="text" class="form-control" name="searchFor" placeholder="Search">
                    <button type="submit">Search Student</button>
             </div>
             </form>
<h1>SLOT ALOCATED STUDENT LIST</h1>
    <table>

                    <tr >
                        <th> First Name </th>
                        <th> Last Name </th>
                        <th> Student ID </th>
                        <th> Email </th>
                        <th> Slot</th>
                    </tr>
                    
                    <?php
                    $q = "select * from user group by SID";
                    $show = mysqli_query($connection,$q);
                    while($res = mysqli_fetch_array($show)){
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

    <script type="text/javascript">
        $(document).ready(function () {
            $('#tabledata').DataTable();
        })
    </script>
</body>
</html>