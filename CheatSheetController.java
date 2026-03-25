import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*") // Allows your HTML to talk to this Java code
public class CheatSheetController {

    @GetMapping("/lessons")
    public List<Lesson> getAllLessons() {
        return Arrays.asList(
            new Lesson(1L, "ITR & GST Basics", "Tax", "Decoding Indian taxes for students."),
            new Lesson(2L, "1BHK Survival Guide", "Realty", "How to rent in Bangalore/Mumbai."),
            new Lesson(3L, "Power of SIPs", "Investment", "Investing ₹500 in Index Funds.")
        );
    }

    @PostMapping("/calculate-sip")
    public double calculateSIP(@RequestParam double monthlyInvestment, @RequestParam int years) {
        double annualRate = 12.0; // 12% average for Indian Index Funds
        double monthlyRate = annualRate / 12 / 100;
        int months = years * 12;
        
        // Formula: FV = P × ({[1 + i]^n – 1} / i) × (1 + i)
        return monthlyInvestment * ((Math.pow(1 + monthlyRate, months) - 1) / monthlyRate) * (1 + monthlyRate);
    }
}