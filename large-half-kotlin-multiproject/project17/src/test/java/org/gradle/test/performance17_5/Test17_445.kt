package org.gradle.test.performance17_5

import org.junit.Assert.*

class Test17_445 {
    private val production = Production17_445("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}