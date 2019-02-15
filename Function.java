public class Function<T> implements Interface<T> {
    Node head;
    Node tail;
    int size;

    public Function() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private class Node {
        T data;
        Node next;
        Node prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }

    @Override
    public boolean isEpmty() {
        if (head == null && tail == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void insertDepan(T data) {
        Node node = new Node(data);
        if (isEpmty()) {
            tail = node;
        } else {
            node.setNext(head);
            head.setPrev(node);
        }
        head = node;
        System.out.println("Insert depan berhasil!");
        size++;
    }

    @Override
    public void insertBelakang(T data) {
        Node node = new Node(data);
        if (isEpmty()) {
            head = node;
        } else {
            node.setPrev(tail);
            tail.setNext(node);
        }
        tail = node;
        System.out.println("Insert belakang berhasil!");
        size++;
    }

    @Override
    public void insertTengah(T data, int key) {
        Node node = new Node(data);
        Node temp = head;
        while ( ((Mahasiswa) temp.getData()).nim != key ) {
            temp = temp.getNext();
        }
        if (temp == tail) {
            node.setNext(null);
            tail = node;
        } else {
            node.setNext(temp.getNext());
            temp.getNext().setPrev(node);
        }
        node.setPrev(temp);
        temp.setNext(node);
        System.out.println("Insert tengah berhasil!");
        size++;
    }

    @Override
    public void hapusDepan() {
        if (isEpmty()) {
            System.out.println("Maaf data kosong!");
        } else {
            if (head.next == null) {
                tail = null;
                head = null;
            } else {
                head = head.getNext();
                head.setPrev(null);
            }
            System.out.println("Hapus depan berhasil!");
            size--;
        }
    }

    @Override
    public void hapusBelakang() {
        if (isEpmty()) {
            System.out.println("Maaf data kosong!");
        } else {
            if (tail.prev == null) {
                System.out.println("Hanya satu data, gunakan hapus depan!");
            } else {
                tail = tail.getPrev();
                tail.setNext(null);
                System.out.println("Hapus belakang berhasil!");
                size--;
            }
        }
    }

    @Override
    public void hapusTengah(int key2) {
        Node temp = head;
        if (head.next == tail) {
            System.out.println();
            System.out.println("Maaf, NIM yang dipilih bukan data tengah!");
            System.out.println();
        } else {
            while (((Mahasiswa) temp.getData()).nim != key2) {
                temp = temp.getNext();
            }
            Node before = temp.prev;
            Node after = temp.next;
            before.next = after;
            after.prev = before;
            temp.setNext(null);
            temp.setPrev(null);
            System.out.println("Hapus berhasil!");
            System.out.println();
        }
    }

    @Override
    public void tampilDepan() {
        Node temp = head;
        int count = 1;
        if (isEpmty()) {
            System.out.println("Maaf, data kosong!");
            System.out.println();
        } else {
            while (temp != null) {
                System.out.println("Mahasiswa ke - " + count);
                ((Mahasiswa) temp.getData()).tampil();
                temp = temp.getNext();
                count++;
            }
        }
    }

    @Override
    public void tampilBelakang() {
        Node temp = tail;
        int count = 1;
        if (isEpmty()) {
            System.out.println("Maaf, data kosong!");
            System.out.println();
        } else {
            while (temp != null) {
                System.out.println("Mahasiswa ke - " + count);
                ((Mahasiswa) temp.getData()).tampil();
                temp = temp.getPrev();
                count++;
            }
        }
    }

    @Override
    public void tampilJuara() {
        Node temp = head;
        Mahasiswa array[] = new Mahasiswa[size];
        for (int i = 0; i < size; i++) {
            array[i] = ((Mahasiswa) temp.getData());
            temp = temp.getNext();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i].nilai >= array[j].nilai) {
                    Mahasiswa temp2 = array[i];
                    array [i] = array[j];
                    array[j] = temp2;
                }
            }
        }
        System.out.println("Nama    : " + array[0].nama);
        System.out.println("NIM     : " + array[0].nim);
        System.out.println("Nilai   : " + array[0].nilai);
        System.out.println();
    }
}
