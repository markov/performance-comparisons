package org.gradle.test.performance7_1

import org.junit.Assert.*

class Test7_53 {
    private val production = Production7_53("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}