import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.platform.engine.Cucumber;
import org.example.entity.Person;
import org.example.entity.Room;
import org.example.port.PersonRepository;
import org.example.port.RoomRepository;
import org.example.service.RoomService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import java.util.Optional;

@Cucumber
@ExtendWith(MockitoExtension.class)
public class CreateRoomFeature {


    private PersonRepository personRepository;
    private RoomRepository roomRepository;
    private RoomService roomService;
    private List<Room> roomList;
    private Room room;

    public CreateRoomFeature() {
        roomRepository = Mockito.mock(RoomRepository.class);
        personRepository = Mockito.mock(PersonRepository.class);
        roomService = new RoomService(roomRepository);
    }

    @ParameterType("true|false")
    public Boolean booleanType(String value) {
        return Boolean.parseBoolean(value);
    }

    @Given("the user is an administrator with verification status set to {booleanType}")
    public void theUserIsAnAdministratorWithVerificationStatusSetTo(Boolean condition) {
        personRepository = Mockito.mock(PersonRepository.class);
        Person user = new Person.Builder()
                .firstName("Jean")
                .lastName("Brandiossi")
                .isAdmin(condition)
                .build();
    }
    @When("the user  creates a room with the name {string} and capacity {int} and id {int}")
    public void theUserCreatesARoomWithTheNameAndCapacityAndId(String name, int capacity, long id) {
        roomRepository = Mockito.mock(RoomRepository.class);
        Room roomTest = new Room.Builder()
                .id(id)
                .name(name)
                .capacity(capacity)
                .build();
    }

    @Then("list with room {long} should be returned")
    public void listWithRoomShouldReturn(long id) {
        Room mockRoom = new Room.Builder().id(id).build();
        Mockito.when(roomRepository.findById(id)).thenReturn(mockRoom);
        Room resultRoom = roomService.findById(id);
        Assertions.assertEquals(id, resultRoom.getId());
    }

}
