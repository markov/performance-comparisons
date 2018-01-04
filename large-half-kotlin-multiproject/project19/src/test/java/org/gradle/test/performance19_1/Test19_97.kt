package org.gradle.test.performance19_1

import org.junit.Assert.*

class Test19_97 {
    private val production = Production19_97("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}