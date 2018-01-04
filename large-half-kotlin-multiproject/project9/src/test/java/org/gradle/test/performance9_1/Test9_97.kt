package org.gradle.test.performance9_1

import org.junit.Assert.*

class Test9_97 {
    private val production = Production9_97("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}