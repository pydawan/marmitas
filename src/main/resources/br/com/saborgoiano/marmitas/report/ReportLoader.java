package br.com.saborgoiano.marmitas.report;

import static br.org.verify.Verify.isEmptyOrNull;

import java.io.File;

/**
 * @author thiago-amm
 * @version v1.0.0 22/08/2018
 * @since v1.0.0
 */
public class ReportLoader {
   
   public static File getFile(String name) throws IllegalArgumentException {
      if (isEmptyOrNull(name)) {
         throw new IllegalArgumentException("Nenhum nome de arquivo foi informado.");
      }
      File file = new File(ReportLoader.class.getResource("").getPath() + name);
      if (!file.exists()) {
         throw new IllegalArgumentException("O arquivo " + name + " não existe!");
      }
      return file;
   }
   
   public static String getFilePath(String filename) throws IllegalArgumentException {
      return getFile(filename).getPath();
   }
   
}
