package com.fmdev.patterns.behavioral.observer.baglai.hard;

/**
 * Created by oleksandr.baglai on 03.09.2015.
 */
public class Main {

    public static void main(String[] args) {
        // ��� ���������
        Recruiter recruiter = new RecruitingDepartment();

        // ���� ���������� ������ �� ����� ������
        AbstractCandidate candidate1 = new StivenPupkin();
        AbstractCandidate candidate2 = new EvaPupkina();

        // ����������� � ��������� ������ ���������
        recruiter.register(candidate1.getResume());
        recruiter.register(candidate2.getResume());

        // �������� �� ���� ������ ��� ��������
        recruiter.addNew(new NifNifProject());
        recruiter.addNew(new NafNafProject());
        recruiter.addNew(new NufNufProject());

        // � ������� �������� ��������
        recruiter.notice();
    }
}
