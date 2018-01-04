package org.gradle.test.performance17_5

import org.junit.Assert.*

class Test17_475 {
    private val production = Production17_475("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}