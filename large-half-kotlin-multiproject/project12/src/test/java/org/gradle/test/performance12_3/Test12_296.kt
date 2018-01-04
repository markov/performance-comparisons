package org.gradle.test.performance12_3

import org.junit.Assert.*

class Test12_296 {
    private val production = Production12_296("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}