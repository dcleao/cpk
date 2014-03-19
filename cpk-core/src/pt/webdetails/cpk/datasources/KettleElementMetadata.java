package pt.webdetails.cpk.datasources;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collections;

public class KettleElementMetadata extends CpkDataSourceMetadata {

  private static Iterable<String> kettleOutputTypes;

  private Iterable<String> kettleStepNames;

  static {
    ArrayList<String> list = new ArrayList<String>();
    list.add( "Inferred" );
    list.add( "Json" );
    list.add( "ResultFiles" );
    list.add( "ResultOnly" );
    list.add( "SingleCell" );
    kettleOutputTypes = Collections.unmodifiableCollection( list );
  }

  @JsonProperty( "kettleOutputTypes" )
  public Iterable<String> getKettleOutputTypes() { return kettleOutputTypes; }

  @JsonProperty( "kettleStepNames" )
  public Iterable<String> getKettleStepNames() { return this.kettleStepNames; }

  public KettleElementMetadata setKettleStepNames( Iterable<String> kettleStepNames ) {
    this.kettleStepNames = kettleStepNames;
    return this;
  }

}
