package org.gradle.test.performance17_4

import org.junit.Assert.*

class Test17_326 {
    private val production = Production17_326("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}