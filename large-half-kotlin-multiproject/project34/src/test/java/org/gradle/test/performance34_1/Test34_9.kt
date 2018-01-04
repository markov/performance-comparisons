package org.gradle.test.performance34_1

import org.junit.Assert.*

class Test34_9 {
    private val production = Production34_9("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}