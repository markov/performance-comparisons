package org.gradle.test.performance19_2

import org.junit.Assert.*

class Test19_199 {
    private val production = Production19_199("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}