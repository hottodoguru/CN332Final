# จัดทำโดย 
## นาย ชนกนันท์ ชูศักดิ์ศิลป์ 6110612998

### Pattern ต่างๆที่ใช้
### Adapter,Strategy และ Facade

#### การใช้งาน ทำการ run code ใน ไฟล์ homepage.java
#### สำหรับ Directory Login นั้นเป็นส่วนของ Login โดยใช้ Pattern Adapter ในการเขียนโค้ด เนื่องจากใช้ Adapter ทำให้สามารถสลับสับเปลี่ยนได้ว่าเราต้องการ Login ด้วยวิธีใด
#### สำหรับ Directory Payment Method เป็นส่วนของการชำระเงิน โดยใช้ Pattern Strategy เนื่องจากว่า Strategy มีความสามารถในการเปลี่ยน Behavior ของ Object ซึ่งใน
#### ในการรันโค้ดผมสามารถสร้าง Object ของ ContextPayment เพื่อใช้สำหรับการชำระเงินได้ โดยเราสามารถเลือกได้เลยว่าจะใช้ วิธีการชำระเงินแบบใด

#### <br>
#### สำหรับ Directory Promotion ใช้ Pattern Facade เนื่องจากมีข้อมูลไม่เยอะ เราสามารถสร้าง Facade เพื่อให้ User สามารถ เรียกดูข้อมูลของ Promotion ต่างๆได้โดยที่ไม่ยุ่งยาก
