@RestController
class HelloController {
  
  @RequestMapping("/")
  String home() {
    return "Hello Groovy"
  }
}
