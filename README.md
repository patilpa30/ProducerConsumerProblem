# Producer Consumer Problem (Java Multithreading)

This project demonstrates the classic **Producer-Consumer problem** using Java threads with `synchronized`, `wait()`, and `notifyAll()`.

It implements a thread-safe shared buffer where:
- A **Producer** thread generates data
- A **Consumer** thread consumes data
- Synchronization ensures no race conditions occur

---

## 🚀 Concepts Covered

- Multithreading in Java
- Thread synchronization
- wait() and notifyAll()
- Monitor locks (intrinsic locking)
- Inter-thread communication
- Bounded buffer implementation
- Handling spurious wakeups using `while` loops

---

## 📂 Project Structure

ProducerConsumerProblem/
│
├── SharedBuffer.java
├── Producer.java
├── Consumer.java
├── Main.java
└── README.md

---

## ⚙️ How It Works

### 🔹 SharedBuffer
- Uses a `Queue<Integer>` as a bounded buffer
- `produce()` waits if buffer is full
- `consume()` waits if buffer is empty
- Uses `synchronized` methods for thread safety
- Uses `wait()` and `notifyAll()` for coordination

### 🔹 Producer
- Produces numbers and adds them to buffer

### 🔹 Consumer
- Removes numbers from buffer and processes them

---

## ▶️ How to Run

### Using IntelliJ IDEA
1. Open project
2. Run `Main.java`

### Using Terminal

```bash
javac *.java
java Main
Produced: 0
Produced: 1
Produced: 2
Buffer is full
Consumed: 0
Produced: 3
...

🔥 Future Improvements

Implement using ReentrantLock

Implement using BlockingQueue

Add multiple producers and consumers

Add unit tests
