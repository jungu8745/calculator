import java.util.ArrayList;
import java.util.List;


public class Calculator {


    protected List<Double> results;


    public Calculator() {
        results = new ArrayList<>();
    }


    public List<Double> getResults() {
        return results;
    }


    public void setResults(List<Double> results) {
        this.results = results;

    }


    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
            System.out.println("가장 오래된 계산 결과가 삭제되었습니다.");
            System.out.println("저장된 결과 : " + results);
        }
        else {
            System.out.println("삭제할 결과가 없습니다.");
            System.out.println("저장된 결과 : " + results);
        }
    }



    public void inquiryResults() {

        System.out.println("저장된 결과 : " + results);

    }

}