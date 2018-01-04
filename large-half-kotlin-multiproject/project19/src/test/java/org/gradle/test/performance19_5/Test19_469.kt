package org.gradle.test.performance19_5

import org.junit.Assert.*

class Test19_469 {
    private val production = Production19_469("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}