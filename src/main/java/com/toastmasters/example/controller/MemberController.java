package com.toastmasters.example.controller;

import java.util.List;
import java.util.Optional;

import com.toastmasters.example.request.MemberRequest;
import com.toastmasters.example.request.StatusRequest;
import com.toastmasters.example.response.MemberResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.toastmasters.example.entity.Member;
import com.toastmasters.example.service.MemberService;

@RestController
@RequestMapping("api/member")
@CrossOrigin(origins = "http://localhost:3000")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping
    public ResponseEntity<MemberResponse> createMember(@RequestBody MemberRequest member) {
        MemberResponse createdMember = memberService.createMember(member);
        return ResponseEntity.ok(createdMember);
    }

    @GetMapping
    public ResponseEntity<List<MemberResponse>> getAllMembers() {
        List<MemberResponse> members = memberService.getAllMembers();
        return ResponseEntity.ok(members);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MemberResponse> getMemberById(@PathVariable Long id) {
        MemberResponse member = memberService.getMemberById(id);
        return member != null ? ResponseEntity.ok(member) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<MemberResponse> updateMember(@PathVariable Long id, @RequestBody MemberRequest memberRequest) {
        MemberResponse updatedMember = memberService.updateMember(id, memberRequest);
        return updatedMember != null ? ResponseEntity.ok(updatedMember) : ResponseEntity.notFound().build();
    }

    @PutMapping("/update-status/{id}")
    public ResponseEntity<String> updateStatusOfMember(@PathVariable Long id, @RequestBody StatusRequest statusRequest) {
        memberService.updateStatusOfMember(id, statusRequest);
        return ResponseEntity.ok("Member status updated successfully...");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMember(@PathVariable Long id) {
        memberService.deleteMember(id);
        return ResponseEntity.ok("Member deleted with give Id : "+id);
    }
}
