package org.gradle.test.performance17_1

import org.junit.Assert.*

class Test17_59 {
    private val production = Production17_59("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}