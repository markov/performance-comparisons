package org.gradle.test.performance44_1

import org.junit.Assert.*

class Test44_9 {
    private val production = Production44_9("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
