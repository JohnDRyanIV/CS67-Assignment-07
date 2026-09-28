1. One thing I learned from the reading | 
    I did not know that a switch statement could be created that selects cases based on object type 
    (switch (vehicle) case Bike... case Car...). I always thought the most you could do with them 
    was use strings. Quick google showed that switch statements with objects were created in 2023,
    called Pattern Matching... cool!

2. What I changed | 
    I added a new class, 'CommercialDriver', that modifies the insurance rate increase after an accident
    by an additional 'commercial surcharge' percentage.

3. Method Overloading & Overriding | 
    I overrode the setInsuranceRate method and the toString method from the Driver class (which
    itself overloads the toString method from Java's 'Object'). This is appropriate as the insurance
    rate adjustment for a commercial driver is by necessity implemented differently from insurance rate
    adjustment for a standard driver. I overloaded a version of the CommercialDriver constructor (now 
    one sets the insurance surcharge amount to 1.05, and the other accepts an argument for the surcharge 
    amount). Kind of limited on what I could overload here, so I just chose to use a constructor.

4. Challenges encountered | 
    The code is a little inflexible to changes, i.e. only 2 cars per crash. I spent about 10 minutes
    attempting to make this program work with ArrayLists and accept crashes with any n number of 
    drivers, but that's really outside the scope of this assignment, so I stopped.

5. Use of AI tools | 
    I did query ChatGPT for brainstorming the class I could extend from, after giving it a plaintext
    description of the project structure.
