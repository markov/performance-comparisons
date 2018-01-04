package org.gradle.test.performance50_1

import org.junit.Assert.*

class Test50_9 {
    private val production = Production50_9("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
