package org.gradle.test.performance37_5

import org.junit.Assert.*

class Test37_475 {
    private val production = Production37_475("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}