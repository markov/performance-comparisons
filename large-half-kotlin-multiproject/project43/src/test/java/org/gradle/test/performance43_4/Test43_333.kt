package org.gradle.test.performance43_4

import org.junit.Assert.*

class Test43_333 {
    private val production = Production43_333("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
