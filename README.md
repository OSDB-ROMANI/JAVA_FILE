# JAVA_FILE
<h3>Libreria java.io.File</h3>
In JAVA l'oggetto file rappresenta sia le directory che i file. Si può creare un oggetto file specificando il percorso (path) e il nome:
<h6>File f = new File(path, nome)<h6>
Il path può essere una Stringa o un oggetto Path, il nome raprresenta il nome della directory o del file (mettere l'estensione)</br>
METODI PRINCIPALI
<ul>
  <li>Per sapere se l'oggetto file punta a una risorsa esistente (directory o file)<h6>f.exists()</h6>restitusce true se la risorsa esiste</li>
  <li>Per cancellare la risorsa puntata dall'oggetto file<h6>f.delete()</h6>restituisce true se riesce la cancellazione</li>
  <li>Per sapere se la risorsa puntata dall'oggetto file è una directory<h6>f.isDirectory()</h6>restituisce true se esiste ed è una directory, false altrimenti</li>  
  <li>Per sapere se la risorsa puntata dall'oggetto file è una file<h6>f.isFile()</h6>restituisce true se esiste ed è un file, false altrimenti</li>  
  <li>Per avere l'elenco delle directory e file contenuti in una directory<h6>f.list()</h6>restituisce un array di stringhe in cui in ogni posizione è presente una stringa con il path assoluto delle risorse contenute, null se non la directory puntata non esiste oppurre un error I/O</li>
  <li>Per creare una directory al path e con il nome specificato<h6>f.mkdir()</h6>restituisce true se riesce a creare la directory</li>
  <li>Per creare una file al path e con il nome specificato<h6>f.createNewFile()</h6>restituisce true se riesce a creare il file</li>
  <li>Per conoscere hashcode della risorsa puntata dall'oggetto file<h6>f.hashCode</h6>Restituisce un numero intero che rappresenta il codice hash code</li>
  <li>Per verificare i permessi puntati dall'oggetto file abbiamo differenti metodi:
    <ul>
      <li><h6>canExecute</h6>Restituisce true se il file può essere eseguito</li>
      <li><h6>canRead</h6>Restituisce true se il file può essere letto</li>
      <li><h6>canWrite</h6>Restituisce true se il file può essere scritto</li>
    </ul>
</ul>

<h3>ESEMPIO PathFile.java</h3>
Esempio per creare un directory o file e controlli se esiste e hash code.
