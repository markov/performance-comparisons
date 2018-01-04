package org.gradle.test.performance17_3

import org.junit.Assert.*

class Test17_246 {
    private val production = Production17_246("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}