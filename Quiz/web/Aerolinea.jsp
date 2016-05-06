<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->


<html>
    <head>
        <title name="titulo">Aerolinea</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  
        <link href="tablecloth/tablecloth.css" rel="stylesheet" type="text/css" media="screen" />
        <link rel="stylesheet" href="CSS/style.css">
        
        
    </head>
   
       
        <div id="todo">
            <div id="titulo">
               
               
            </div>
        <div ID ="tituloprim"  >
                        <br>
                        <br>
                     <FONT  face="Comic Sans MS" size=10 color="#FE2E2E"><center>!!AEROLINEA!!</center></FONT
                     <br>
                     <br>
                     <center><FONT  face="verdana" size=5 color="#04B431"><center></center> NUEVOS VUELOS </FONT></center>
                    </div>
       <div id="menu">
           <ul>
                <li><a href="PaginaPrincipal.jsp">pagina principal</a></li>	
            </ul>
	</div>        
        <div id="contenedor">          
                     <table id="tablaNormal" >
                           <tr >
                               <td>
                                   <form class="register" method="POST" action="ControladorAerolinea">                                                   
                                       <h1 class="register-title">CREAR AEROLINEA</h1>                                       
                                       <input type="text" class="register-input" placeholder="Nombre Aerolinea" id="usuario" name="nombreAerolinea">
                                       
                                         <input type="submit" name="accion" value="Crear" class="register-button">
                                   </form>
                               </td>
                               <td>
                                 <div id="right">                
                                     <form class="register" method="POST" action="ControladorAerolinea"> 
                                     <h1  class="register-title">Listado de Aerolineas</h1> 
                                                    
                                              <table >
                                                  <tr>
                                                        <th ID="colum1" >ID </th>
                                                        <th id="colum2" >Aerolinea</th>                        
                                                      </tr>                                             
                                                
                                                <tr>
                                                    <td>no content</td>
                                                    <td>no content</td>
                                                </tr>
                                            </table>
                                     
                                     </form>                                 
                                              
                                               

                                       </td>
                                    </table> 
                        </div>   
                      </div>
                </div>
            </body>
</html>