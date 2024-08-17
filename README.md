# Car park simulator

This project models a pay to stay car park using Java. Every car recieves a ticket on arrival
stamped with the car's arrival time. On departure the duration of the stay is calculated as 
the car leaves. 

Here is an example I/O of the final program with the bold being the input being in bold

Car Park Simulator

The current time is 00:00:00.

Commands: advance {minutes}, arrive, depart, quit.

**arrive**

Ticket issued: Ticket[id=80000001, time=00:00:00].

**advance 1**

The current time is 00:01:00.

**arrive**

Ticket issued: Ticket[id=80000002, time=00:01:00].

**advance 15**

The current time is 00:16:00.

**depart 80000001**

Ticket details: Ticket[id=80000001, time=00:00:00].

Current time: 00:16:00.

Duration of stay: 0 hours 16 minutes.

**advance 6**

The current time is 00:22:00.

**depart 80000002**

Ticket details: Ticket[id=80000002, time=00:01:00].

Current time: 00:22:00.

Duration of stay: 0 hours 21 minutes.

**quit**

Goodbye.
